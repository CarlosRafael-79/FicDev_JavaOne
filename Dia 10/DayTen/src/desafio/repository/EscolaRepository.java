/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.repository;

import desafio.model.Escola;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ficdev
 */
public class EscolaRepository implements Repository<Escola>{
    
    @Override
    public void create(Escola objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "INSERT INTO escola(nome) VALUES (?);";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public List<Escola> read(){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "SELECT * FROM escola;";                                                                                                                                                                               
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            List<Escola> escolas = new ArrayList<>();
            while(rs.next()){
                
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Escola escola = new Escola(id,nome);
                escolas.add(escola);
            }
            conexao.close();
            return escolas;                                                     
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void update(Escola objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "UPDATE escola SET nome = ? WHERE id = ?;";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2,objeto.getId());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void delete(Escola objeto){
        try{
            Connection conexao = ConexaoPadrao.getConnection();
            String sql = "DELETE FROM escola WHERE id = ?;";                                                                                                                                                                                       
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.execute();
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
