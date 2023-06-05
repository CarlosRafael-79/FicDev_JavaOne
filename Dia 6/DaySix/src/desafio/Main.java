/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        
        boolean parar = false;
        String escolhas[] = {"Adicionar", "Concluir", "Fechar"};
        String prioridades[] = {"Baixa", "Média", "Alto"};
        String opcoes[] = {"Concluir", "Cancelar"};
        
        JComboBox prioridade = new JComboBox(prioridades);
        JTextField nome = new JTextField();
        JTextField descricao = new JTextField();
        
        Object[] corpo = {
            "Nome: ", nome,
            "Descricao: ", descricao,
            "Prioridade: ", prioridade
        };
        
        
        while(true){
            int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a ação que deseja fazer: ",
            "Gerenciador de Tarefas",
            JOptionPane.WARNING_MESSAGE,
            0,
            null,
            escolhas,
            escolhas[2]);
            
            switch(escolha){
                case 0:
                    int opcao = JOptionPane.showOptionDialog(
                    null,
                    corpo,
                    "Gerenciador de Tarefas",
                    JOptionPane.WARNING_MESSAGE,
                    0,
                    null,
                    opcoes,
                    opcoes[1]);
                    if(opcao == 0){
                        Tarefa novo = new Tarefa(nome.getText(), descricao.getText(), prioridade.getSelectedIndex());
                        gerenciador.incluirTarefa(novo);
                        
                        nome.setText("");
                        descricao.setText("");
                        prioridade.setSelectedIndex(0);
                    }
                    break;
                case 1:
                    String listaTarefas = "";
                    for(var tarefa : gerenciador.getTarefas()){
                        listaTarefas += "\n---------------------------------\nID: "+tarefa.getId()+"\nNome: "+tarefa.getNome()+"\nPrioridade: "+tarefa.getPrioridade()+"\nConcluida: "+tarefa.isConcluido()+"\nDescrição:\n "+ tarefa.getDescricao()+"\n";
                    }
                    listaTarefas += "\n Digite o ID da tarefa que deseja concluir: ";
                    String resposta = JOptionPane.showInputDialog(null, listaTarefas);
                    if(resposta != null && resposta.matches("[0-9]+")){
                       int respostaInt = Integer.parseInt(resposta);
                       for(var tarefa : gerenciador.getTarefas()){
                            if(tarefa.getId() == respostaInt){
                                tarefa.setConcluido(true);
                            }
                        } 
                    }
                    
                    
                    break;
                case 2:
                    parar = true;
                    break;
                
            }
            
            if(parar) break;
        }
    }
}
