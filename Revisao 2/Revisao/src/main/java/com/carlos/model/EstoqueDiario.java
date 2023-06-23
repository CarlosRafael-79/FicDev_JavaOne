/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class EstoqueDiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstoque;
    @Column( nullable = false)
    private LocalDate data;
    @Column(name = "qtdeitens")
    private int quantidadeItens;
    @Column(columnDefinition= "TEXT")
    private String entregador;
    
    private int guiaEntrega;
    
    @ManyToOne
    @Column( nullable = false)
    private Merendeira merendeira;
}
