/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.Aluno;
import com.mycompany.view.AlunoVisao;


public class AlunoControle {
    private Aluno aluno;
    private AlunoVisao alunoVisao;

    public AlunoControle(Aluno aluno, AlunoVisao alunoVisao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
    }
    
    public void atualizaDadosAluno(String matricula, String nome, int idade){
        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setIdade(idade);
        exibirDetalhesAluno();
    }
    
    public void exibirDetalhesAluno() {
        String matricula = aluno.getMatricula();
        String nome = aluno.getNome();
        int idade = aluno.getIdade();
        AlunoVisao.exibirDadosAluno(matricula, nome, idade);
    }
}
