/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import com.carlos.model.Disciplina;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class DisciplinaDao implements Dao<Disciplina> {
    @Override
    public void create(Disciplina objeto){
        Conexao.getConexao().persist(objeto);
    }
    @Override
    public Disciplina read(int id){
        return Conexao.getConexao().find(Disciplina.class,id);
    }
    @Override
    public void update(Disciplina objeto){
        Conexao.getConexao().merge(objeto);
    }
    @Override
    public void delete (Disciplina objeto){
        Conexao.getConexao().remove(objeto);
    }
    @Override
    public List<Disciplina> readAll(){
        return Conexao.getConexao().findAll(Disciplina.class);
    }
}
