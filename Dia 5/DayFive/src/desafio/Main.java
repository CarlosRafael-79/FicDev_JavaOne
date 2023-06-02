/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner input = new Scanner(System.in);
        int i, j;
        jogo.exibirTabuleiro();
        
        while(!jogo.isTerminou()){
            i = input.nextInt();
            j = input.nextInt();

            jogo.fazerJogada(i,j);
            jogo.exibirTabuleiro();
        }
    }
}
