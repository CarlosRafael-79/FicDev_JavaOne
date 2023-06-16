/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Aluno;
import repository.AlunoDAO;
import repository.Conexao;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getConexao();
        AlunoDAO dao = new AlunoDAO();
        Aluno aluno1 = new Aluno("Carlos Rafael", 10.0);
        Aluno aluno2 = new Aluno(25,"Allan Toledo", 2.0);
        
        dao.create(aluno1);
        dao.create(aluno2);
        
        System.out.println(aluno2.getId());
        conexao.close();
        
    }
}
