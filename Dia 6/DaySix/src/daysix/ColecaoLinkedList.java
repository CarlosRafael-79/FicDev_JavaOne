package daysix;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ColecaoLinkedList {
    public static void main(String[] args) {
        Queue<Carro> fila = new LinkedList<>();
        fila.add(new Carro("Ford", "Mustang", 2020));
        fila.add(new Carro("Chevrolet", "Camaro", 2021));
        fila.add(new Carro("Dodge", "Charger", 2019));
        JOptionPane.showMessageDialog(null, String.format("Lista %n" + fila));
        Carro carroRemovido = fila.remove();
        JOptionPane.showMessageDialog(null, String.format("Carro Removido %n" + carroRemovido)); 
    }
}
