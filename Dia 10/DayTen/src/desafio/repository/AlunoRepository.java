/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.repository;

import desafio.model.Aluno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class AlunoRepository implements Repository<Aluno>{
    @Override
    public void create(Aluno objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "INSERT INTO aluno(nome, idade, id_escola) VALUES (?,?,?);";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2,objeto.getIdade());
            stmt.setInt(3,objeto.getIdEscola());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public List<Aluno> read(){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "SELECT * FROM aluno;";                                                                                                                                                                               
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            List<Aluno> alunos = new ArrayList<>();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                int idEscola = rs.getInt("id_escola");
                Aluno aluno = new Aluno(id,nome,idade,idEscola);
                alunos.add(aluno);
            }
            conexao.close();
            return alunos;                                                     
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void update(Aluno objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "UPDATE aluno SET nome = ?, idade = ?, id_escola = ? WHERE id = ?;";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2,objeto.getIdade());
            stmt.setInt(3,objeto.getIdEscola());
            stmt.setInt(4, objeto.getId());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void delete(Aluno objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "DELETE FROM aluno WHERE id = ?;";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
