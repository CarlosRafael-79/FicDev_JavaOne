/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import com.carlos.model.Aluno;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class AlunoDao  implements Dao<Aluno>{
    
    @Override
    public void create(Aluno objeto){
        Conexao.getConexao().persist(objeto);
    }
    @Override
    public Aluno read(int id){
        return Conexao.getConexao().find(Aluno.class,id);
    }
    @Override
    public void update(Aluno objeto){
        Conexao.getConexao().merge(objeto);
    }
    @Override
    public void delete (Aluno objeto){
        Conexao.getConexao().remove(objeto);
    }
    @Override
    public List<Aluno> readAll(){
        return Conexao.getConexao().findAll(Aluno.class);
    }
}
