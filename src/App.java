package src;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javazoom.jl.converter.Converter;
import javazoom.jl.decoder.JavaLayerException;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App extends JFrame implements NativeKeyListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private AudioPlayer audio[] = new AudioPlayer[10];
    private Boolean jouer;

    public App() {
        Configuration.conf();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setLocationRelativeTo(null);
        setTitle("Soundboard");
        setSize(450,450);

        for (int i = 0; i < 10; i++){
            audio[i] = new AudioPlayer(i);
        }
        jouer = true;

        GridBagConstraints gridBag = new GridBagConstraints();
        CardLayout card = new CardLayout();

        JPanel pCurr = new JPanel(card);
        JPanel pPlay = new JPanel(new GridBagLayout());
        JPanel pUSon = new JPanel(new GridBagLayout());
        JPanel pUKey = new JPanel(new GridBagLayout());
        JMenu mOption = new JMenu("Options");

        JMenuBar mBar = new JMenuBar();

        // Le panel pour jouer les sons
        gridBag.fill = GridBagConstraints.HORIZONTAL;
        gridBag.gridx = 0;
        JLabel lPlay[] = new JLabel[10];
        for (int i = 1; i <= 10; i++) {
            lPlay[i - 1] = new JLabel("Jouer le son " + i + " en tenant la touche : " + Configuration.key[i - 1]);

            gridBag.gridy = i - 1;
            pPlay.add(lPlay[i - 1], gridBag);
            gridBag.insets = new Insets(10, 0, 0, 0);
        }

        // Le panel pour changer les sons
        JLabel lUSon[] = new JLabel[10];

        JButton bUSon[] = new JButton[10];

        gridBag.insets = new Insets(0, 0, 0, 0);

        gridBag.gridy = 0;
        gridBag.gridx = 0;
        JLabel lUTitre = new JLabel("Importer vos propre son avec l'extention .wav");

        pUSon.add(lUTitre, gridBag);

        for (int i = 1; i <= 10; i++) {
            gridBag.gridx = 0;
            lUSon[i - 1] = new JLabel("Changer le son " + i + " ");
            bUSon[i - 1] = new JButton("Importer");

            gridBag.gridy = i;
            pUSon.add(lUSon[i - 1], gridBag);
            gridBag.gridx = 1;
            pUSon.add(bUSon[i - 1], gridBag);
            gridBag.insets = new Insets(10, 0, 0, 0);
        }

        bUSon[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "0.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "1.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "2.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "3.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "4.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "5.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "6.wav");
                        System.out.println("Success");
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "7.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "8.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        bUSon[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("/Users"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    Converter c = new Converter();
                    try {
                        c.convert(source.toString(), "9.wav");
                        System.out.println("Success");
                        toFront();
                        requestFocus();
                    } catch (JavaLayerException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                }
            }
        });

        // Le panel pour changer les touches
        JLabel lUKey[] = new JLabel[10];
       
        @SuppressWarnings("unchecked")
        JComboBox<Item>[] cUKey = new JComboBox[10];

        gridBag.insets = new Insets(0,0,0,0);

        for (int i = 1; i <= 10; i++){
            lUKey[i-1] = new JLabel("Changer la touche " + i + " ");
            cUKey[i-1] = new JComboBox<Item>();
            for (int j = 0; j < Configuration.keyCodeMap.size(); j++){
                cUKey[i-1].addItem(new Item(Configuration.keyCodeMap.get(j), Configuration.keyTextMap.get(j)));
            }
            cUKey[i-1].getModel().setSelectedItem(new Item(Configuration.code[i-1], Configuration.key[i-1]));

            gridBag.gridy = i-1;
            gridBag.gridx = 0;
            pUKey.add(lUKey[i-1], gridBag);
            gridBag.gridx = 1;
            pUKey.add(cUKey[i-1], gridBag);
            gridBag.insets = new Insets(10,0,0,0);
        }

        JButton bUKey = new JButton("Enregistrer les modifications");
        bUKey.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter myWriter = new FileWriter("input.txt");
                    for (int i = 0; i < 10; i++){
                        Item item = (Item) cUKey[i].getModel().getSelectedItem();

                        if (i != 9){
                            myWriter.write(item.getId() + "\n"); 
                        }else{
                            myWriter.write(item.getId() + ""); 
                        }
                    }
                    myWriter.close();
                    Configuration.remplir();
                    for (int i = 1; i <= 10; i++){
                        lPlay[i-1].setText("Jouer le son " + i + " en tenant la touche : " + Configuration.key[i-1]);
                        cUKey[i-1].getModel().setSelectedItem(new Item(Configuration.code[i-1], Configuration.key[i-1]));
                    }
                    toFront();
                    requestFocus();
                } catch (IOException er) {
                    System.out.println("An error occurred.");
                    er.printStackTrace();
                }
            }
        });
       
        gridBag.gridy = 10;
        gridBag.gridx = 0;
        pUKey.add(bUKey, gridBag);

        add(mBar, BorderLayout.NORTH);

        pCurr.add(pPlay, "pPlay");
        pCurr.add(pUSon, "pUSon");
        pCurr.add(pUKey, "pUKey");

        JMenuItem mPlay = new JMenuItem(new AbstractAction("Jouer les sons") {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                resetAudio();
                card.show(pCurr, "pPlay");
            }
        });

        JMenuItem mOSon = new JMenuItem(new AbstractAction("Changer les sons") {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                closeAudio();
                card.show(pCurr, "pUSon");
            }
        });

        JMenuItem mOKey = new JMenuItem(new AbstractAction("Changer les touches") {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            @Override
            public void actionPerformed(ActionEvent e) {
                closeAudio();
                card.show(pCurr, "pUKey");
            }
        });

        mBar.add(mPlay);
        mOption.add(mOKey);
        mOption.add(mOSon);
        mBar.add(mOption);

        add(pCurr);
        Runnable waitRunner = new Runnable() {

            public void run() {
                try {
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        setVisible(true);
        Thread th = new Thread(waitRunner, "th");
        th.start();
    }
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
        logger.setUseParentHandlers(false);
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        
        GlobalScreen.addNativeKeyListener(new App());
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

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
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
    public void nativeKeyReleased(NativeKeyEvent e) {
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

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
        
    }

}