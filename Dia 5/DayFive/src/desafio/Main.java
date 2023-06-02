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
        int i, j, contador = 0;
        char ganhador = '-';
        jogo.exibirTabuleiro();
        
        while(!jogo.isTerminou()){
            i = input.nextInt();
            j = input.nextInt();

            jogo.fazerJogada(i,j);
            jogo.exibirTabuleiro();
            if(jogo.getTurno() > 2){
                ganhador = jogo.ganhador();
                if(ganhador != '-') break;
            }
            contador++;
            if(contador == 9) break;
        }
        if(ganhador == '-'){
            System.out.println("O jogo deu velha, portanto não existe ganhador.");
        }else{
            System.out.println("O jogador "+ganhador+" é o vencedor.");
        }
    }
}
