/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author ficdev
 */

public class Tarefa implements Comparable{


    public static enum Prioridade{
        BAIXA, MEDIA, ALTA
        
    }
    private String nome;
    private String descricao;
    private Prioridade prioridade = Prioridade.BAIXA;
    private boolean concluido = false;
    private int id;
    
    public Tarefa(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public Tarefa(String nome, String descricao, int p){
        this.nome = nome;
        this.descricao = descricao;
        
        Prioridade prioridade;
        switch (p) {
            case 2:
                prioridade = Prioridade.ALTA;
                break;
            case 1:
                prioridade = Prioridade.MEDIA;
                break;
            default:
                prioridade = Prioridade.BAIXA;
                break;
        }
        this.prioridade = prioridade;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the concluido
     */
    public boolean isConcluido() {
        return concluido;
    }

    /**
     * @param concluido the concluido to set
     */
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    /**
     * @return the prioridade
     */
    public Prioridade getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    
    @Override
    public int compareTo(Object o){
        Tarefa other = (Tarefa) o;
        return  other.prioridade.ordinal() - this.prioridade.ordinal();
    }

    @Override
    public String toString() {
        return "Tarefa{" + "nome=" + nome + ", descricao=" + descricao + ", prioridade=" + prioridade + ", concluido=" + concluido + ", id=" + id + '}';
    }
    
    
    
    
    
}
