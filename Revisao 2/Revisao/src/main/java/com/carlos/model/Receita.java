/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceita;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String nomeReceita;
    @Column(name = "nroingredientes")
    private int numeroIngredientes = 0;
    
    @ManyToOne
    @Column( nullable = false)
    private Nutricionista nutricionista;
}