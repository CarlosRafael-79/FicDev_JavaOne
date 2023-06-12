/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.principal;

import desafio.model.Aluno;
import desafio.model.Escola;
import desafio.repository.AlunoRepository;
import desafio.repository.EscolaRepository;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ficdev
 */
public class App {
    
    public static int escolhaCRUD(String operacoes[]){
        return JOptionPane.showOptionDialog(
                    null,
                    "Qual operacao do CRUD deseja realizar?",
                    "Escolhao operacao CRUD",
                    JOptionPane.WARNING_MESSAGE,
                    0,
                    null,
                    operacoes,
                    operacoes[4]);
    }
    
    public static int operacaoCRUD(Object[] operacao, String opcoes[]){
        return JOptionPane.showOptionDialog(
                            null,
                            operacao,
                            "Operecao",
                            JOptionPane.WARNING_MESSAGE,
                            0,
                            null,
                            opcoes,
                            opcoes[1]);
    }
    public static void main(String[] args) {
       
        boolean parar = false;
        String escolhas[] = {"Escola", "Aluno", "Fechar"};
        String operacoes[] = {"Create", "Read", "Update","Delete","Cancelar"};
        String opcoes[] = {"Concluir", "Cancelar"};
        
        JTextField id = new JTextField();
        JTextField nome = new JTextField();
        JTextField idade = new JTextField();
        JTextField idEscola = new JTextField();
        
        Object[] createEscola = {
            "Nome: ", nome
        };
        Object[] updateEscola = {
            "Id: ", id,
            "Nome", nome
        };
        
        Object[] createAluno = {
            "Nome: ", nome,
            "Idade: ", idade,
            "Id Escola: ", idEscola
        };
        Object[] updateAluno = {
            "Id: ",id,
            "Nome: ", nome,
            "Idade: ", idade,
            "Id Escola: ", idEscola
        };
        Object[] delete = {
            "Id: ", id
        };
        
        
        while(true){
            int escolha = JOptionPane.showOptionDialog(
            null,
            "Qual tabela que deseja manipular?",
            "Escolha Tabela",
            JOptionPane.WARNING_MESSAGE,
            0,
            null,
            escolhas,
            escolhas[2]);
            
            switch(escolha){
                case  0 -> {
                    int operacao = escolhaCRUD(operacoes);
                    Escola escola = new Escola();
                    EscolaRepository escolaRepository = new EscolaRepository();
                    
                    switch(operacao){
                        case 0 -> {
                            int opcao = operacaoCRUD(createEscola,opcoes);
                            
                            if(opcao == 0){
                                escola.setNome(nome.getText());
                                escolaRepository.create(escola);
                                
                                nome.setText("");
                            }
                    
                        }
                        case 1 -> {
                            List<Escola> escolas = escolaRepository.read();
                            String texto = "";
                            for(var objeto : escolas){
                                texto += "\nID: "+objeto.getId()+"\nNome: "+objeto.getNome()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, texto);
                        }
                        case 2 -> {
                            int opcao = operacaoCRUD( updateEscola,opcoes);
                            
                            if(opcao == 0){
                                escola.setId(Integer.parseInt(id.getText()));
                                escola.setNome(nome.getText());
                                escolaRepository.update(escola);
                                
                                id.setText("");
                                nome.setText("");
                            }
                        }
                        case 3 -> {
                            int opcao = operacaoCRUD( delete,opcoes);
                            
                            if(opcao == 0){
                                escola.setId(Integer.parseInt(id.getText()));
                                escolaRepository.delete(escola);
                                
                                id.setText("");
                            }
                        }
                        
                    }
                }
                case  1 -> {
                    int operacao = escolhaCRUD(operacoes);
                    
                    Aluno aluno = new Aluno();
                    AlunoRepository alunoRepository = new AlunoRepository();
                    
                    switch(operacao){
                        case 0 -> {
                            int opcao = operacaoCRUD(createAluno,opcoes);
                            
                            if(opcao == 0){
                                aluno.setNome(nome.getText());
                                aluno.setIdade(Integer.parseInt(idade.getText()));
                                aluno.setIdEscola(Integer.parseInt(idEscola.getText()));
                                alunoRepository.create(aluno);
                                
                                
                                nome.setText("");
                                idade.setText("");
                                idEscola.setText("");
                            }
                    
                        }
                        case 1 -> {
                            List<Aluno> alunos = alunoRepository.read();
                            String texto = "";
                            for(var objeto : alunos){
                                texto += "\nID: "+objeto.getId()+"\nNome: "+objeto.getNome()+"\nIdade: "+objeto.getIdade()+"\nID Escola: "+objeto.getIdEscola()+"\n";
                            }
                            JOptionPane.showMessageDialog(null, texto);
                        }
                        case 2 -> {
                            int opcao = operacaoCRUD( updateAluno,opcoes);
                            
                            if(opcao == 0){
                                aluno.setId(Integer.parseInt(id.getText()));
                                aluno.setNome(nome.getText());
                                aluno.setIdade(Integer.parseInt(idade.getText()));
                                aluno.setIdEscola(Integer.parseInt(idEscola.getText()));
                                alunoRepository.update(aluno);
                                
                                id.setText("");
                                nome.setText("");
                                idade.setText("");
                                idEscola.setText("");
                            }
                        }
                        case 3 -> {
                            int opcao = operacaoCRUD( delete,opcoes);
                            
                            if(opcao == 0){
                                aluno.setId(Integer.parseInt(id.getText()));
                                alunoRepository.delete(aluno);
                                
                                id.setText("");
                            }
                        }
                        
                    }
                }
                case  2 -> parar = true;
            }
            
            if(parar) break;
        }
    }
}
