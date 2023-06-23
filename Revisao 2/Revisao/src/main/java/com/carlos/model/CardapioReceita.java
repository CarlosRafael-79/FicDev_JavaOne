/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class CardapioReceita {
    
    @Column( nullable = false)
    private int quantidade;
    
    @Id
    @ManyToOne
    @Column( nullable = false)
    private CardapioDiario cardapio;
    
    @Id
    @ManyToOne
    @Column( nullable = false)
    private Receita receita;
}
