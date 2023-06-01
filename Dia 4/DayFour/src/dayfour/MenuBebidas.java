/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dayfour;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rafael
 */
public class MenuBebidas {
public static void main(String[] args){
        
        int opcao;
        float preco = 0.0f;
        String menu = "Menu Bebidas:\n1 - Café\n2 - Coca-Cola\n3 - Água\n4 - Chá\n";
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu+"Digite a opcao desejda: "));
        
        switch(opcao){
            case 1:
                preco = 2.5f;
                break;
            case 2:
                preco = 4.0f;
                break;
            case 3:
                preco = 6.25f;
                break;
            case 4:
                preco = (1.015f + 0.015f);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida.");
                break;
        }
        
        if(preco != 0.0f) JOptionPane.showMessageDialog(null,String.format("O preço pago na sua bebia foi R$%.2f", preco));;
    }
}
