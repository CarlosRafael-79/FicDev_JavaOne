/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ficdev
 */
public class Conexao {
    private static Conexao conexao;
    private static EntityManagerFactory factory ;
    private static EntityManager em;
    
    private Conexao(){
        factory = Persistence.createEntityManagerFactory("desafio11");
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
    
    public void close(){
        em.close();
        factory.close();
        conexao = null;
    }
}
