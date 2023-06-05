/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author ficdev
 */
public class AutoIncremento {
    private int atual = -1;

    /**
     * @return the atual
     */
    public int getAtual() {
        return atual;
    }

    /**
     * @param atual the atual to set
     */
    public void setAtual(int atual) {
        this.atual = atual;
    }
    
    public int getNextValue(){
        this.atual++;
        return this.atual;
    }
}
