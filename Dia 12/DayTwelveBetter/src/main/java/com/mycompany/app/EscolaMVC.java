/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import com.mycompany.controller.AlunoControle;
import com.mycompany.model.Aluno;
import com.mycompany.view.AlunoVisao;

/**
 *
 * @author ficdev
 */
public class EscolaMVC {
    public static void main(String[] args) {
        // Modelo
        Aluno aluno = new Aluno("CIA223", "Fernanda Alves", 25);
        
        // Visao
        AlunoVisao alunoVisao = new AlunoVisao();
        
        // Controle
        AlunoControle alunoControle = new AlunoControle(aluno, alunoVisao);
        alunoControle.exibirDetalhesAluno();
        alunoControle.atualizaDadosAluno("CIB261", "Ana Cruz", 23);
    }
}
