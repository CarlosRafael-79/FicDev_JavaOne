/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafio.model;

/**
 *
 * @author Carlos Rafael
 */
public class EquacaoPrimeiroGrau {
    private float a;
    private float x;
    private float b;
    
    public EquacaoPrimeiroGrau(float a, float x, float b){
        this.a = a;
        this.x = x;
        this.b = b;
    }

    /**
     * @return the a
     */
    public float getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }
    
    public float calcularEquacao(){
        return a*x + b;
    }
    
}
