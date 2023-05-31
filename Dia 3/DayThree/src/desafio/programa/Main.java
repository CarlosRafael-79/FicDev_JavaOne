/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafio.programa;

import desafio.model.EquacaoPrimeiroGrau;
import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float a,x,b;
        
        System.out.println("Digite o valor de a na equacao de primeiro grau: ");
        a = input.nextFloat();
        System.out.println("Digite o valor de x na equacao de primeiro grau: ");
        x = input.nextFloat();
        System.out.println("Digite o valor de b na equacao de primeiro grau: ");
        b = input.nextFloat();
        
        EquacaoPrimeiroGrau equacao = new EquacaoPrimeiroGrau(a,x,b);
        
        System.out.println("O resultado de "+a+"*"+x+"+"+b+" = "+equacao.calcularEquacao());
    }
}
