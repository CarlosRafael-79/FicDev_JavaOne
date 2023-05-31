package daythree.meuPrograma;
import daythree.geometria.Retangulo;

// Definindo a classe Main
public class Main {

    // Método principal do programa
    public static void main(String[] args){

        // Criando um objeto da classe Retangulo com base 5 e altura 19

        Retangulo retangulo = new Retangulo(5, 16);

        // Calculando a área e o perímetro do retângulo
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        // Imprimindo os resultados na tela

        System.out.println("Área do retângulo: "+ area);

        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}