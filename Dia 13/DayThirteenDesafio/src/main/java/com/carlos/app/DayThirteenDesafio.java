/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.carlos.app;

import com.carlos.model.Livro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author carlos
 */
public class DayThirteenDesafio {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("desafio13");
        EntityManager em = factory.createEntityManager();
        
        Livro livro = new Livro("O Mar Azul","Joao Pessoa",2012);
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(livro);
        tx.commit();
        
        
        em.close();
        factory.close();
    }
}
