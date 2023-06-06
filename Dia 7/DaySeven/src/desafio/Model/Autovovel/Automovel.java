/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Autovovel;

import desafio.Model.Transporte;

/**
 *
 * @author ficdev
 */
public class Automovel extends Transporte{
    private String motor;
    private int numeroRodas;
    
    public Automovel(int cp, float cc, float v, String m){
        super(cp,cc, v);
        this.motor = m;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the numeroRodas
     */
    public int getNumeroRodas() {
        return numeroRodas;
    }

    /**
     * @param numeroRodas the numeroRodas to set
     */
    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
    
    
}
