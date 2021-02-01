package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.awt.event.KeyEvent;

public class Configuration {
    static String key[] = new String[10];
    static int code[] = new int[10];
    static List<Integer> keyCodeMap = new ArrayList<Integer>();
    static List<String> keyTextMap = new ArrayList<String>();

    public static void remplir() {
        for(int i = 0; i < 1000000; ++i) {                                                    
            String text = KeyEvent.getKeyText(i);                              
            if(!text.contains("Unknown keyCode: ")) {                                         
                keyCodeMap.add(i);
                keyTextMap.add(text);
            }                                                                                 
        }         

        try{
            FileReader fr= new FileReader("input.txt");   
            int cmpt = 0;
    
            Scanner scanner = new Scanner(fr);

            while(scanner.hasNextInt()) {
                int next = scanner.nextInt();
                code[cmpt] = next;
                key[cmpt] = KeyEvent.getKeyText(next);
	            cmpt+=1;
            }

            scanner.close();
    
        }catch (IOException e){
            System.out.println("File Not Found!");
        }
    }
    
}