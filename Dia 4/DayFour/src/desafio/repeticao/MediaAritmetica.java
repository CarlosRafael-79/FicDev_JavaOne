/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafio.repeticao;

import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class MediaAritmetica {
    public static void main(String[] args){
        float i = 0,n, soma = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite os valores em sequência, caso queira parar escreva um número menor que 0. ");
        while(true){
            n = input.nextFloat();
            if(n <= 0){
                break;
            }
            soma += n;
            i++;
        }
       
        System.out.println("Sua média aritmética é "+soma/i);
        
        
    }
}
