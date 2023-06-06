/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Animal;

import desafio.Model.Transporte;

/**
 *
 * @author ficdev
 */
public class PropulcaoAnimal extends Transporte{
    private Animal animal;
    private int numeroRodas;
    
    public PropulcaoAnimal( int cp, float cc, float v, Animal animal){
        super(cp,cc,v);
        this.animal = animal;
    }
    /**
     * @return the animal
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * @param animal the animal to set
     */
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    @Override
    public void Transportar(int quantidadePessoas){
        if(quantidadePessoas > getCapacidadePessoa()){
            System.out.println("Impossível Transportar essa quantidade de pessoas.");
        }else{
            float velocidade = getAnimal().getVelocidade();
            if(getVelocidade() < getAnimal().getVelocidade()) velocidade = getVelocidade();
            System.out.println("Transportando pessoas para o seu destino, sua velocidae é de "+velocidade+" km/h.");
        }
    }
    
    @Override
    public void Transportar(float quantidadeCarga){
        if(quantidadeCarga > getCapacidadeCarga()){
            System.out.println("Impossível Transportar essa quantidade de carga.");
        }else{
            float velocidade = getAnimal().getVelocidade();
            if(getVelocidade() < getAnimal().getVelocidade()) velocidade = getVelocidade();
            System.out.println("Transportando carga para o seu destino, sua velocidae é de "+velocidade+" km/h.");
        }
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
