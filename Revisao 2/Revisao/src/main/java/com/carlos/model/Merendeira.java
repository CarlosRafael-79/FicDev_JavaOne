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
public class Merendeira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoMerendeira;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String nomeMerendeira;
}
