/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.carlos.app;

import com.carlos.model.Aluno;
import com.carlos.repository.AlunoDao;
import com.carlos.repository.Conexao;

/**
 *
 * @author ficdev
 */
public class Main{
    

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Carlos Rafael");
        AlunoDao alunoDao = new AlunoDao();
        
        alunoDao.create(aluno);
        
        Conexao.getConexao().close();
        
    }
}
