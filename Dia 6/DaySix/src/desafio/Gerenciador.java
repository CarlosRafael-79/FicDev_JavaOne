/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class Gerenciador {
    private List<Tarefa> tarefas = new ArrayList<>();
    private AutoIncremento idAtual = new AutoIncremento();

    /**
     * @return the tarefas
     */
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    /**
     * @param tarefas the tarefas to set
     */
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    
    public void incluirTarefa(Tarefa tarefa){
        tarefa.setId(this.idAtual.getNextValue());
        this.tarefas.add(tarefa);
        Collections.sort(this.tarefas);
    }
    
    public boolean concluirTarefa(int posicao){
        if(posicao < 0 || posicao > this.idAtual.getAtual()){
            return false;
        }else{
            for(var tarefa : this.tarefas){
                if(tarefa.getId() == posicao){
                    tarefa.setConcluido(true);
                    break;
                }
            }
            return true;
        }
    }
    
    public void exibirTarefas(){
        for(Tarefa tarefa : this.tarefas){
            System.out.println(tarefa.toString());
            System.out.println("");
        }
    }
}
