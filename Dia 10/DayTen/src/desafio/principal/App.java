/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.principal;

import desafio.model.Escola;
import desafio.repository.EscolaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ficdev
 */
public class App {
    public static void main(String[] args) {
        
        Escola escola = new Escola(4,"Escola Teste 2");
        EscolaRepository er = new EscolaRepository();
        
        List<Escola> lista = er.read();
        
        for(var objeto : lista){
            System.out.println("ID: "+objeto.getId()+" Nome: "+objeto.getNome());
        }
    }
}
