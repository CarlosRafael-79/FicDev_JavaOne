package daytwo;

import java.util.Locale;
import java.util.Scanner;

public class DayTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        
        System.out.println("Digite a primeira letra do seu nome: ");
        char letra = input.nextLine().charAt(0);
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite a sua altura: ");
        float altura = input.nextFloat();
        System.out.println("Digite true para feliz e false para triste: ");
        boolean feliz = input.nextBoolean();
        
        System.out.println("---------------------------------------------");
        
        System.out.println("Primeira letra do nome: "+letra);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Feliz: "+feliz);
        
    }
    
}
