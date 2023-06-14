/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class Uncheked {
    
    public static void dividirPorZero(int n){
        System.out.println("Inicio");
        int x = n/0;
        System.out.println("Fim");
    }
    
    public static void indexOutOfBounds(String texto){
        System.out.println("Inicio");
        char c = texto.charAt(texto.length());
        System.out.println("Fim");
    }
}
