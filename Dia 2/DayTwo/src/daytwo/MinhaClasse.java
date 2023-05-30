package daytwo;


public class MinhaClasse {
    private int valor1;
    private int valor2;
    
    public MinhaClasse(int v1, int v2){
        valor1 = v1;
        valor2 = v2;
    }
    
    public int somar(){
        return valor1 + valor2;
    }
    
    public int subtrair(){
        return valor1 - valor2;
    }
}
