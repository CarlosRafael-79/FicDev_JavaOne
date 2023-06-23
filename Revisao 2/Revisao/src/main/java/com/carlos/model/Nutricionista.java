/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carlos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"crn"})})
public class Nutricionista {
    @Id
    @Column (columnDefinition = "TEXT")
    private String nome;
    @Column( nullable = false, columnDefinition= "TEXT")
    private String crn;
    @Column( nullable = false, columnDefinition= "TEXT" )
    private String uf;
}
