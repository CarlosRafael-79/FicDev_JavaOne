/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import com.carlos.model.Nutricionista;
import java.util.List;

/**
 *
 * @author carlos
 */
public class NutricionistaDao implements Dao<Nutricionista> {
     @Override
    public void create(Nutricionista objeto){
        Conexao.getConexao().persist(objeto);
    }
    @Override
    public Nutricionista read(int id){
        return Conexao.getConexao().find(Nutricionista.class,id);
    }
    @Override
    public void update(Nutricionista objeto){
        Conexao.getConexao().merge(objeto);
    }
    @Override
    public void delete (Nutricionista objeto){
        Conexao.getConexao().remove(objeto);
    }
    @Override
    public List<Nutricionista> readAll(){
        return Conexao.getConexao().findAll(Nutricionista.class);
    }
}
