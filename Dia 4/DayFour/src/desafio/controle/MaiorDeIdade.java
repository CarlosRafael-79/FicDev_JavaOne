package desafio.controle;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args){
        int idade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        
        if(idade > 18){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade.");
        }
        
    }
}
