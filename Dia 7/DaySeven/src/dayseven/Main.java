package dayseven;

public class Main {

    public static void animais() {
        System.out.println(String.format("%n" + "Animais" + "%n"));
        Animal animal = new Animal(4, 10);
        Cachorro cachorroA = new Cachorro(4, 20, Pelagem.CARAMELO);
        Animal cachorroB = new Cachorro(4, 30, Pelagem.MALHADO);

        System.out.println(animal);
        System.out.println(cachorroA);
        System.out.println(cachorroB);
    }

    public static void heranca() {
        System.out.println(String.format("%n" + "Herança" + "%n"));
        Animal animais[] = new Animal[2];
        animais[0] = new Animal(4, 30);
        animais[1] = new Cachorro(4, 15, Pelagem.BRANCO);

        for (Animal n : animais) {
            System.out.println(n);
        }
    }

    public static void sons() {
        System.out.println(String.format("%n" + "Sons" + "%n"));
        Animal animais[] = new Animal[3];
        animais[0] = new Animal(4, 30);
        animais[1] = new Cachorro(4, 15);
        animais[2] = new Gato(4, 10);

        for (Animal animal : animais) {
            animal.falar();
        }
    }

    public static void main(String[] args) {
        animais();
        heranca();
        sons();
    }
}
