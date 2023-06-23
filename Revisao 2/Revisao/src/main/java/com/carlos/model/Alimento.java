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
import lombok.Data;

@Data
@Entity
public class Alimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlimento;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String nomeAlimento;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String unidadeMedida;
}
