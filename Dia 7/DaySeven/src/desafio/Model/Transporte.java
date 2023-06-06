/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model;

/**
 *
 * @author ficdev
 */
public class Transporte {
    private int capacidadePessoa;
    private float capacidadeCarga;
    private float velocidade;
    
    public Transporte(){
        
    }
    
    public Transporte( int cp, float cc, float v){
        this.capacidadePessoa = cp;
        this.capacidadeCarga = cc;
        this.velocidade = v;
    }


    /**
     * @return the capacidadePessoa
     */
    public int getCapacidadePessoa() {
        return capacidadePessoa;
    }

    /**
     * @param capacidadePessoa the capacidadePessoa to set
     */
    public void setCapacidadePessoa(int capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

    /**
     * @return the capacidadeCarga
     */
    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * @param capacidadeCarga the capacidadeCarga to set
     */
    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    /**
     * @return the velocidade
     */
    public float getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    public void Transportar(int quantidadePessoas){
        if(quantidadePessoas > this.capacidadePessoa){
            System.out.println("Impossível Transportar essa quantidade de pessoas.");
        }else{
            System.out.println("Transportando pessoas para o seu destino, sua velocidae é de "+this.velocidade+" km/h.");
        }
    }
    
    public void Transportar(float quantidadeCarga){
        if(quantidadeCarga > this.capacidadeCarga){
            System.out.println("Impossível Transportar essa quantidade de carga.");
        }else{
            System.out.println("Transportando a carga para o seu destino, sua velocidae é de "+this.velocidade+" km/h.");
        }
    }

    
}
