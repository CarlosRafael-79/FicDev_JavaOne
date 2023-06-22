/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.view;

import com.carlos.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class AlunoVisao {
    
    public static void exibirDadosAluno(Aluno aluno){
        System.out.println("Id: "+aluno.getId());
        System.out.println("Nome : "+aluno.getName());
        System.out.println("Coefieciente: "+aluno.getCoeficiente());
    }
    
    public static Aluno cadastrarAluno(Aluno novo){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        novo.setName(input.nextLine());
        System.out.println("Digite o coeficiente do aluno: ");
        novo.setCoeficiente(input.nextDouble());
        
        input.close();
        return novo;
    }
}
