/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Principal;

import desafio.Model.Autovovel.Carro;

/**
 *
 * @author ficdev
 */
public class App {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(5,300.0f,100.0f,"5.0");
        
        meuCarro.Transportar(2.0f);
        meuCarro.Transportar(2);
    }
}
