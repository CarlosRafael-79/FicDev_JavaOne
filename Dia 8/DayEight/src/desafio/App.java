/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ficdev
 */
public class App {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader br = new BufferedReader(new FileReader("/test.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }catch(IOException e){
            System.err.println(e);
        }finally{
            System.out.println("Acabou o programa.");
        }
    }
    
    
}
