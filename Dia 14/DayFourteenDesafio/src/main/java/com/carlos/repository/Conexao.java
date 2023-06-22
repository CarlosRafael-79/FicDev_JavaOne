/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ficdev
 */
public class Conexao {
    private static Conexao conexao;
    private static EntityManagerFactory factory ;
    private static EntityManager em;
    
    private Conexao(){
        factory = Persistence.createEntityManagerFactory("desafio13");
        em = factory.createEntityManager();
    }
    
    public static Conexao getConexao(){
        if(conexao == null) conexao = new Conexao();
        return conexao;
    }
    
    public void persist(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(o);
        tx.commit();
    }
    
    public <T extends Object> T find(Class<T> type, Object o){
        return em.find(type, o);
    }
    
    
    public void remove(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(em.merge(o));
        tx.commit();
    }
    
    public void merge(Object o){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(o);
        tx.commit();
    }
    
    public <T extends Object> List<T> findAll(Class<T> type) {
        Query query = em.createQuery("FROM " + type.getName());
        return query.getResultList();
       }
    
    public void close(){
        em.close();
        factory.close();
        conexao = null;
    }
}
