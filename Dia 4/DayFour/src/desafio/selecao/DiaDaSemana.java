/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafio.selecao;

import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class DiaDaSemana {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número relativo ao dia na semana: ");
        int dia = input.nextInt();
        
        switch(dia){
            case 2 -> System.out.println("Segunda-Feira");
            case 3 -> System.out.println("Terça-Feira");
            case 4 -> System.out.println("Quarta-Feira");
            case 5 -> System.out.println("Quinta-Feira");
            case 6 -> System.out.println("Sexta-Feira");
            case 7 -> System.out.println("Sábado");
            case 1 -> System.out.println("Domingo");
            default -> System.out.println("Valor inválido");
        }
    }
}

