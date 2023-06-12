/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.model;

/**
 *
 * @author ficdev
 */
public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private int idEscola;

    public Aluno(int id, String nome,int idade, int idEscola){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.idEscola = idEscola;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the idEscola
     */
    public int getIdEscola() {
        return idEscola;
    }

    /**
     * @param idEscola the idEscola to set
     */
    public void setIdEscola(int idEscola) {
        this.idEscola = idEscola;
    }
    
    
}
