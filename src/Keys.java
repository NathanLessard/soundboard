package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {
    private AudioPlayer audio[] = new AudioPlayer[10];

    public Keys(){
        for (int i = 0; i < 10; i++){
            audio[i] = new AudioPlayer(i);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed " + e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == Configuration.code[0]) {
            audio[0].jouer();
        }else if(e.getKeyCode() == Configuration.code[1]){
            audio[1].jouer();
        }else if(e.getKeyCode() == Configuration.code[2]){
            audio[2].jouer();
        }else if(e.getKeyCode() == Configuration.code[3]){
            audio[3].jouer();
        }else if(e.getKeyCode() == Configuration.code[4]){
            audio[4].jouer();
        }else if(e.getKeyCode() == Configuration.code[5]){
            audio[5].jouer();
        }else if(e.getKeyCode() == Configuration.code[6]){
            audio[6].jouer();
        }else if(e.getKeyCode() == Configuration.code[7]){
            audio[7].jouer();
        }else if(e.getKeyCode() == Configuration.code[8]){
            audio[8].jouer();
        }else if(e.getKeyCode() == Configuration.code[9]){
            audio[9].jouer();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == Configuration.code[0]) {
            audio[0].arret();
        }else if(e.getKeyCode() == Configuration.code[1]){
            audio[1].arret();
        }else if(e.getKeyCode() == Configuration.code[2]){
            audio[2].arret();
        }else if(e.getKeyCode() == Configuration.code[3]){
            audio[3].arret();
        }else if(e.getKeyCode() == Configuration.code[4]){
            audio[4].arret();
        }else if(e.getKeyCode() == Configuration.code[5]){
            audio[5].arret();
        }else if(e.getKeyCode() == Configuration.code[6]){
            audio[6].arret();
        }else if(e.getKeyCode() == Configuration.code[7]){
            audio[7].arret();
        }else if(e.getKeyCode() == Configuration.code[8]){
            audio[8].arret();
        }else if(e.getKeyCode() == Configuration.code[9]){
            audio[9].arret();
        }
    }
}
