/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daythree.geometria;

/**
 *
 * @author ficdev
 */
// Definindo a classe Retangulo
public class Retangulo {

    // Propriedades do retângulo
    private double base;
    private double altura;

    // Construtor da classe

    public Retangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
    }
    
    // Método para calcular a área do retângulo
    public double calcularArea(){
    return this.getBase() * this.getAltura();
    }
    
    // Método para calcular o perímetro do retângulo
    public double calcularPerimetro() {
        return 2 * (this.getBase() + this.getAltura());
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}