/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Humana;

/**
 *
 * @author ficdev
 */
public class Triciclo extends PropulsaoHumana{
    
    public Triciclo(int cp, float cc, float v, int tempoResistencia) {
        super(cp, cc, v, tempoResistencia);
        setNumeroRodas(3);
    }
    
}
