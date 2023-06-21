/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import com.carlos.model.Turma;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class TurmaDao implements Dao<Turma> {
    @Override
    public void create(Turma objeto){
        Conexao.getConexao().persist(objeto);
    }
    @Override
    public Turma read(int id){
        return Conexao.getConexao().find(Turma.class,id);
    }
    @Override
    public void update(Turma objeto){
        Conexao.getConexao().merge(objeto);
    }
    @Override
    public void delete (Turma objeto){
        Conexao.getConexao().remove(objeto);
    }
    @Override
    public List<Turma> readAll(){
        return Conexao.getConexao().findAll(Turma.class);
    }
}
