package src;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class AudioPlayer implements LineListener {
    private Clip clip;
    private AudioInputStream audioStream;
    private String filePath;
    private File audioFile;
    private DataLine.Info info;
    private AudioFormat format;

    public AudioPlayer(int c) {
        
        filePath = c + ".wav";

        audioFile = new File(filePath);

        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
            format = audioStream.getFormat();
 
            info = new DataLine.Info(Clip.class, format);
 
            clip = (Clip) AudioSystem.getLine(info);
 
            clip.addLineListener(this);
 
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        }
 
        
    }

    public void jouer() {
        clip.start();
    }

    public void arret() {
        clip.setMicrosecondPosition(0);
        clip.stop();
        //clip.close();
        //resetAudioStream();
    }

    public void resetAudioStream() {
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);

            clip = (Clip) AudioSystem.getLine(info);
 
            clip.addLineListener(this);
 
            clip.open(audioStream);
        } catch (IOException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        }catch (UnsupportedAudioFileException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        }
    }

    public void closeAllStream(){
        try {
            clip.stop();
            clip.close();
            audioStream.close();
            System.out.println("Stream fermer sur : " + filePath);
        } catch (IOException e) {
            System.out.println("Erreur : " + e);
            e.printStackTrace();
        }
    }

    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        if (type == LineEvent.Type.OPEN) {
            System.out.println("OPEN");
          } else if (type == LineEvent.Type.CLOSE) {
            System.out.println("CLOSE");
          } else if (type == LineEvent.Type.START) {
            System.out.println("START");
          } else if (type == LineEvent.Type.STOP) {
            System.out.println("STOP");
          }
    }
}