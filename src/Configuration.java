package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jnativehook.keyboard.NativeKeyEvent;

public class Configuration {
    static String key[] = new String[10];
    static int code[] = new int[10];
    static List<Integer> keyCodeMap = new ArrayList<Integer>();
    static List<String> keyTextMap = new ArrayList<String>();

    public static void conf(){
        for(int i = 0; i < 1000000; ++i) {                                                    
            String text = NativeKeyEvent.getKeyText(i);                              
            if(!text.contains("Unknown keyCode: ")) {                                         
                keyCodeMap.add(i);
                keyTextMap.add(text);
            }                                                                                 
        }

        remplir();
    }

    public static void remplir() {
        try{
            FileReader fr= new FileReader("input.txt");   
            int cmpt = 0;
    
            Scanner scanner = new Scanner(fr);

            while(scanner.hasNextInt()) {
                int next = scanner.nextInt();
                code[cmpt] = next;
                key[cmpt] = NativeKeyEvent.getKeyText(next);
	            cmpt+=1;
            }

            scanner.close();
    
        }catch (IOException e){
            System.out.println("File Not Found!");
        }
    }
    
}