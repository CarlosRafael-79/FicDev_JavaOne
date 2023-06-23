
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos
 */
public class TesteCalculadora {
    @Test
    public void testarSoma(){
        int x = 10;
        int y = 10;
        int soma = x + y;
        assertEquals(soma,Calculadora.soma(x, y));
    }
    
    @Test
    public void testarSubtracao(){
        int x = 10;
        int y = 10;
        int soma = x - y;
        assertEquals(soma,Calculadora.subtracao(x, y));
    }
}
