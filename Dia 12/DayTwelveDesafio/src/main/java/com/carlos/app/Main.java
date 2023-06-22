/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.app;

import com.carlos.controller.AlunoControle;
import com.carlos.model.Aluno;
import com.carlos.repository.AlunoDao;
import com.carlos.repository.Conexao;
import com.carlos.view.AlunoVisao;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        AlunoDao dao = new AlunoDao();
        AlunoVisao visao = new AlunoVisao();
        AlunoControle controle = new AlunoControle(aluno,visao,dao);
        
        controle.inserirAluno();
        controle.atualizaDadosAluno("Aluno qualquer", 9.8);
        
        
        Conexao.getConexao().close();
    }
}
