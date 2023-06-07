package dayseven;

public class Animal {
    private int altura;
    private int pata;
    
    public Animal(int pata, int altura){
        this.pata = pata;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Animal(" + "Altura: " + altura + ", Pata: " + pata + ')';
    }
    
    public void falar() {
        System.out.println("Som");
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPata() {
        return pata;
    }

    public void setPata(int pata) {
        this.pata = pata;
    }
}
