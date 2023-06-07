package dayseven;

public class Gato extends Animal {
    private Pelagem pelagem;

    public Gato(int p, int a){
        super(p, a);
    }
    
    public Gato(int p, int a, Pelagem pelagem) {
        super(p, a);
        this.pelagem = pelagem;
    }
    
    @Override
    public String toString() {
        return "Gato(Patas: " + super.getPata() + ", Altura: " + super.getAltura() + ", Pelagem: " + pelagem + ')';
    }
    
    @Override
    public void falar() {
        System.out.println("Miau!");
    }

    public Pelagem getPelagem() {
        return pelagem;
    }

    public void setPelagem(Pelagem pelagem) {
        this.pelagem = pelagem;
    }
}
