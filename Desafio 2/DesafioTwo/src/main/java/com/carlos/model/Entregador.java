/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class Entregador{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identregador")
    private int id;
    
    @Column(name = "nomeentregador", nullable = false, columnDefinition= "TEXT")
    private String nome;    
    
    @Column( nullable = false, columnDefinition= "TEXT")
    private String cnh;
    
    @Column(name = "data_ultima_entrega", nullable = false)
    private LocalDate ultimaEntrega;
    
    private int uuid;

}
