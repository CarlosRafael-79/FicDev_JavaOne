/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dayfour;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rafael
 */
public class CadastroAlunos {
    public static void main(String[] args){
        //criando o array para armazenar os dados alunos
        String[][] alunos = new String[50][3];
        //variavel para controlar a quantidade de alunos cadastrados
        int qtdAlunos = 0;
        //laço para permitir que o usuário cadastre váriso alunos
        while(true){
            //recebendo os dados do usuário com JOptionPane
            String nome  = JOptionPane.showInputDialog(null,"Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno: "));
            double nota = Double.parseDouble((JOptionPane.showInputDialog(null,"Digite a nota do aluno: ")));
            
            //armazenando os dados do aluno no array
            alunos[qtdAlunos][0] = nome;
            alunos[qtdAlunos][1] = Integer.toString(idade);
            alunos[qtdAlunos][2] = Double.toString(nota);
            qtdAlunos++;
            
            //verificando se o usuário deseja cadastrar outro aluno
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?");
            if(opcao != JOptionPane.YES_OPTION) break;
        }
        
        //exibindo os dados dos alunos cadastrados
        String listaAlunos = "Lista de alunos:\n";
        double totalNotas = 0.0;
        for(int i = 0; i < qtdAlunos; i++){
            listaAlunos += alunos[i][0]+" - "+alunos[i][1]+" - "+" anos - Nota: "+ alunos[i][2]+"\n";
            totalNotas += Double.parseDouble(alunos[i][2]);
        }
        double mediaNotas = totalNotas / qtdAlunos;
        listaAlunos += "\nMédia das notas: "+mediaNotas;
        JOptionPane.showMessageDialog(null, listaAlunos);
        
    }
}
