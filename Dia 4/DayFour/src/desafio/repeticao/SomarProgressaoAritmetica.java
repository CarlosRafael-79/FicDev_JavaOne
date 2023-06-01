package desafio.repeticao;

import java.util.Scanner;

/**
 *
 * @author Carlos Rafael
 */
public class SomarProgressaoAritmetica {
    public static void main(String[] args){
        float a1,n,r, soma = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial: ");
        a1 = input.nextFloat();
        System.out.println("Digite o termo que é acrescentado: ");
        r = input.nextFloat();
        System.out.println("Digite até qual posição dessa sequência você quer somar: ");
        n = input.nextFloat();
        
        for(int i = 1; i <= n; i++){
            soma += a1 + (i-1)*r;
        }
        
        System.out.println("Valor do somatório das PA até sequencia na posição "+n+" é "+soma);
        
        
    }
}
