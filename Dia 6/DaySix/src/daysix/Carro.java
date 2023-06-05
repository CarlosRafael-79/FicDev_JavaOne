package daysix;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro(" + "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ')';
    }
}
