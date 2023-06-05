/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import desafio.Tarefa.Prioridade;
import java.util.Scanner;
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
        /*
        Tarefa tarefa1 = new Tarefa("Jantar","Fazer o meu jantar");
        Tarefa tarefa2 = new Tarefa("Estudar","Estudar para prova de amanhã",Prioridade.ALTA);
        Tarefa tarefa3 = new Tarefa("Malhar","Fazer o treino de perna", Prioridade.MEDIA);
        
        
        
        gerenciador.incluirTarefa(tarefa1);
        gerenciador.incluirTarefa(tarefa2);
        gerenciador.incluirTarefa(tarefa3);
        
        gerenciador.concluirTarefa(2);
        
        gerenciador.exibirTarefas();*/
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
                        Tarefa novo = new Tarefa(nome.getText(), descricao.getText());
                        gerenciador.incluirTarefa(novo);
                    }
                    break;
                case 1:
                    for(var tarefa : gerenciador.getTarefas()){
                        JOptionPane.showMessageDialog(null, tarefa.toString());
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
