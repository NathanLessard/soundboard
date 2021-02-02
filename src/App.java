package src;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class App {
    public static void main(String[] args) throws Exception {
        Configuration.conf();
        JFrame fenetre = new JFrame("Soundboard");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(425, 450);

        GridBagConstraints gridBag = new GridBagConstraints();
        CardLayout card = new CardLayout();

        JPanel pCurr = new JPanel(card);
        JPanel pPlay = new JPanel(new GridBagLayout());
        JPanel pUSon = new JPanel(new GridBagLayout());
        JPanel pUKey = new JPanel(new GridBagLayout());

        fenetre.addKeyListener(new Keys());

        JMenu mOption = new JMenu("Options");

        JMenuBar mBar = new JMenuBar();

        // Le panel pour jouer les sons
        gridBag.fill = GridBagConstraints.HORIZONTAL;
        gridBag.gridx = 0;
        JLabel lPlay[] = new JLabel[10];
        for (int i = 1; i <= 10; i++) {
            lPlay[i - 1] = new JLabel("Jouer le son " + i + " avec la touche : " + Configuration.key[i - 1]);

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
                    File dest = new File(System.getProperty("user.dir") + "\\0.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\1.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\2.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\3.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\4.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\5.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\6.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success" + dest.toPath());
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\7.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                    File dest = new File(System.getProperty("user.dir") + "\\8.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                chooser.setCurrentDirectory(new File("/Users/Downloads"));
                int retrival = chooser.showSaveDialog(null);
                if (retrival == JFileChooser.APPROVE_OPTION) {
                    File source = chooser.getSelectedFile();
                    File dest = new File(System.getProperty("user.dir") + "\\9.wav");
                    try {
                        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Success");
                    } catch (IOException ex) {
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
                } catch (IOException er) {
                    System.out.println("An error occurred.");
                    er.printStackTrace();
                }
                for (int i = 1; i <= 10; i++){
                    lPlay[i-1].setText("Jouer le son " + i + " avec la touche : " + Configuration.key[i-1]);
                    cUKey[i-1].getModel().setSelectedItem(new Item(Configuration.code[i-1], Configuration.key[i-1]));
                }
            }
        });
       
        gridBag.gridy = 10;
        gridBag.gridx = 0;
        pUKey.add(bUKey, gridBag);

        fenetre.add(mBar, BorderLayout.NORTH);

        pCurr.add(pPlay, "pPlay");
        pCurr.add(pUSon, "pUSon");
        pCurr.add(pUKey, "pUKey");

        JMenuItem mPlay = new JMenuItem(new AbstractAction("Jouer les sons") {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pCurr, "pPlay");
            }
        });

        JMenuItem mOSon = new JMenuItem(new AbstractAction("Changer les sons") {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pCurr, "pUSon");
            }
        });

        JMenuItem mOKey = new JMenuItem(new AbstractAction("Changer les touches") {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(pCurr, "pUKey");
            }
        });

        mBar.add(mPlay);
        mOption.add(mOKey);
        mOption.add(mOSon);
        mBar.add(mOption);

        fenetre.add(pCurr);
        fenetre.setVisible(true);
    }
}