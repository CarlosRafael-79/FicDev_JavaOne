/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.controller;

import com.carlos.model.Aluno;
import com.carlos.repository.AlunoDao;
import com.carlos.view.AlunoVisao;

/**
 *
 * @author carlos
 */
public class AlunoControle {
    private Aluno aluno;
    private AlunoVisao alunoVisao;
    private AlunoDao alunoDao;

    public AlunoControle(Aluno aluno, AlunoVisao alunoVisao, AlunoDao alunoDao) {
        this.aluno = aluno;
        this.alunoVisao = alunoVisao;
        this.alunoDao = alunoDao;
    }
    
    public void inserirAluno(){
        alunoDao.create(alunoVisao.cadastrarAluno(aluno));
    }
    
    public void atualizaDadosAluno(String nome, double coeficiente){
        aluno.setName(nome);
        aluno.setCoeficiente(coeficiente);
        alunoDao.update(aluno);
        
        exibirDetalhesAluno();
    }
    
    public void exibirDetalhesAluno() {
        AlunoVisao.exibirDadosAluno(aluno);
    }
}
