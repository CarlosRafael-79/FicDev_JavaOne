/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import com.carlos.model.Desempenho;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class DesempenhoDao implements Dao<Desempenho> {
    @Override
    public void create(Desempenho objeto){
        Conexao.getConexao().persist(objeto);
    }
    @Override
    public Desempenho read(int id){
        return Conexao.getConexao().find(Desempenho.class,id);
    }
    @Override
    public void update(Desempenho objeto){
        Conexao.getConexao().merge(objeto);
    }
    @Override
    public void delete (Desempenho objeto){
        Conexao.getConexao().remove(objeto);
    }
    @Override
    public List<Desempenho> readAll(){
        return Conexao.getConexao().findAll(Desempenho.class);
    }
}
