/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class TesteUncheked {
    public static void main(String[] args) {
        
        try{
            Uncheked.dividirPorZero(10);
        }catch(ArithmeticException ex){
            System.out.println("Certo");
        }
        
        try{
            Uncheked.indexOutOfBounds("Palavra");
        }catch(IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
