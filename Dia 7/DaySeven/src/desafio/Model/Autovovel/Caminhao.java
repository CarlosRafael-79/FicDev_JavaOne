/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Autovovel;

/**
 *
 * @author ficdev
 */
public class Caminhao extends Automovel{
    
    public Caminhao(int n, int cp, float cc, String m, int numeroRodas) {
        super(n, cp, cc, m);
        setNumeroRodas(numeroRodas);
    }
    
}
