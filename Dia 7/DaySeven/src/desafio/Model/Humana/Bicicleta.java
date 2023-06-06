/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Humana;

/**
 *
 * @author ficdev
 */
public class Bicicleta extends PropulsaoHumana{
    
    public Bicicleta(int cp, float cc, float v, int tempoResistencia) {
        super(cp, cc, v, tempoResistencia);
        setNumeroRodas(2);
    }
    
    
}
