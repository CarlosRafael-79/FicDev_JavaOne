/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class Checked {
    
    public static void apenasPositivos(int n) throws MinhaExcecao{
        if(n < 0){
            throw new MinhaExcecao("Deu ruim");
        }
        System.out.println(n);
    }
}
