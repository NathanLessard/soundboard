package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {
    private AudioPlayer audio[] = new AudioPlayer[10];
    private Boolean jouer;

    public Keys(){
        for (int i = 0; i < 10; i++){
            audio[i] = new AudioPlayer(i);
        }
        jouer = true;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (jouer){
            if (e.getKeyCode() == Configuration.code[0]) {
                audio[0].jouer();
            }
            if(e.getKeyCode() == Configuration.code[1]){
                audio[1].jouer();
            }
            if(e.getKeyCode() == Configuration.code[2]){
                audio[2].jouer();
            }
            if(e.getKeyCode() == Configuration.code[3]){
                audio[3].jouer();
            }
            if(e.getKeyCode() == Configuration.code[4]){
                audio[4].jouer();
            }
            if(e.getKeyCode() == Configuration.code[5]){
                audio[5].jouer();
            }
            if(e.getKeyCode() == Configuration.code[6]){
                audio[6].jouer();
            }
            if(e.getKeyCode() == Configuration.code[7]){
                audio[7].jouer();
            }
            if(e.getKeyCode() == Configuration.code[8]){
                audio[8].jouer();
            }
            if(e.getKeyCode() == Configuration.code[9]){
                audio[9].jouer();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (jouer){
            if (e.getKeyCode() == Configuration.code[0]) {
                audio[0].arret();
            }
            if(e.getKeyCode() == Configuration.code[1]){
                audio[1].arret();
            }
            if(e.getKeyCode() == Configuration.code[2]){
                audio[2].arret();
            }
            if(e.getKeyCode() == Configuration.code[3]){
                audio[3].arret();
            }
            if(e.getKeyCode() == Configuration.code[4]){
                audio[4].arret();
            }
            if(e.getKeyCode() == Configuration.code[5]){
                audio[5].arret();
            }
            if(e.getKeyCode() == Configuration.code[6]){
                audio[6].arret();
            }
            if(e.getKeyCode() == Configuration.code[7]){
                audio[7].arret();
            }
            if(e.getKeyCode() == Configuration.code[8]){
                audio[8].arret();
            }
            if(e.getKeyCode() == Configuration.code[9]){
                audio[9].arret();
            }
        }
    }

    public void closeAudio(){
        if(jouer){
            for (int i = 0; i < 10; i++){
                audio[i].closeAllStream();
            }
            jouer = false;
        }
    }

    public void resetAudio(){
        if (!jouer){
            for (int i = 0; i < 10; i++){
                audio[i].resetAudioStream();
            }
            jouer = true;
        }
    }
}
