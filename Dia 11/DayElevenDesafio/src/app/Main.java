/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.List;
import java.util.Scanner;
import model.Aluno;
import repository.AlunoDAO;
import repository.Conexao;

/**
 *
 * @author ficdev
 */
public class Main {
    private static AlunoDAO alunoDAO = new AlunoDAO();
    
    private static void atualizarCoeficiente(int id, double coeficiente){
        Aluno aluno = alunoDAO.read(id);
        aluno.setCoeficiente(coeficiente);
        alunoDAO.update(aluno);
    }
    public static void main(String[] args) {
        
        List<Aluno> lista = alunoDAO.readAll();
        Aluno aluno;
        
        if(lista.isEmpty()){
            aluno = new Aluno("Aluno Qualquer",10.0);
            alunoDAO.create(aluno);
        }else{
            aluno = lista.get(lista.size()-1);
            
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o novo coeciente do aluno "+aluno.getName()+": ");
        double novoCoeficiente = input.nextDouble();
        
        atualizarCoeficiente(aluno.getId(),novoCoeficiente);
        
        System.out.println("O coeficiente atual é: "+alunoDAO.read(aluno.getId()).getCoeficiente());
        
        Conexao.getConexao().close();
        
    }
}
