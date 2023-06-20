/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double coeficiente;
    
    public Aluno(){
        
    }
    
    public Aluno(String name, double coeficiente){
        this.name = name;
        this.coeficiente = coeficiente;
    }
    
    public Aluno(int id, String name, double coeficiente){
        this.id = id;
        this.name = name;
        this.coeficiente = coeficiente;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the coeficiente
     */
    public double getCoeficiente() {
        return coeficiente;
    }

    /**
     * @param coeficiente the coeficiente to set
     */
    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }
    
    
}
