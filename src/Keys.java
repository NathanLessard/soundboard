package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key typed " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("key released " + e.getKeyChar());
    }
    
}
