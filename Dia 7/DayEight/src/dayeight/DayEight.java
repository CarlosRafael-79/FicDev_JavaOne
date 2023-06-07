/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dayeight;

import java.sql.*;

/**
 *
 * @author ficdev
 */
public class DayEight {

   public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // registra o driver
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://172.17.0.2:5432/teste", "postgres", "123456"); // abre conexão
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente;"); // executa comando SQL
            while (rs.next()) { //manipula resultado
                int id = rs.getInt("id_cliente");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade"); 
                System.out.println(id + ", " + nome + ", " + idade);
            }
            conn.close(); // fecha conexão
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

