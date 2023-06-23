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
public class CardapioDiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCardapio;
    @Column( nullable = false)
    private LocalDate data;
    //verificar
    @Column( nullable = false)
    private char turno;
    @Column( name = "qtdereceitas")
    private int quantidadeReceitas = 0;
    
    @ManyToOne
    private Merendeira merendeira;
}
