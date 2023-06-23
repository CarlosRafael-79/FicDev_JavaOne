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
public class ItemEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItemEstoque;
    
    private double saldoIncial;
    private double entrada;
    private double saida;
    private double saldoFinal;
    
    @ManyToOne
    @Column( nullable = false)
    private Alimento alimento;
    @ManyToOne
    @Column( nullable = false)
    private EstoqueDiario estoqueDiario;
}
