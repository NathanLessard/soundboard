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

    public AudioPlayer(int c) {
        
        filePath = c + ".wav";

        audioFile = new File(filePath);

        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
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
        clip.stop();
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(0);
    }

    public void resetAudioStream() {
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
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

    public void closeAllStream(){
        clip.close();
        try {
            audioStream.close();
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
            clip.close();
          }
    }
}
