/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Humana;

import desafio.Model.Transporte;

/**
 *
 * @author ficdev
 */
public class PropulsaoHumana extends Transporte{
    private int tempoResistencia;
    private int numeroRodas;
    
    
    public PropulsaoHumana(int cp, float cc, float v, int tempoResistencia){
        super(cp,cc,v);
        this.tempoResistencia = tempoResistencia;
    }
    /**
     * @return the tempoResistencia
     */
    public int getTempoResistencia() {
        return tempoResistencia;
    }

    /**
     * @param tempoResistencia the tempoResistencia to set
     */
    public void setTempoResistencia(int tempoResistencia) {
        this.tempoResistencia = tempoResistencia;
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
