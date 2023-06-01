/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dayfour;

import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class VerificadorDePrimo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digito um número: ");
        int n = input.nextInt();
        
        boolean primo = true;
        if(n < 2){
            primo = true;
        }else{
            for(int i = 2; i < n; i++){
                if(n%i == 0){
                    primo = false;
                }
            }
        }
        
        if(primo){
            System.out.println("Seu valor é primo!");
        }else{
            System.out.println("Seu valor não é primo!");
        }
        input.close();
    }
}
