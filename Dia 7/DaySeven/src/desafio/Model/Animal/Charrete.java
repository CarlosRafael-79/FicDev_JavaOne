/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.Model.Animal;

/**
 *
 * @author ficdev
 */
public class Charrete extends PropulcaoAnimal{
    
    public Charrete(int cp, float cc, float v, Animal animal) {
        super(cp, cc, v, animal);
        setNumeroRodas(2);
    }
    
}
