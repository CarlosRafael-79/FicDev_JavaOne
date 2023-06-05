package daysix;

import java.util.HashMap;

public class ColecaoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Charlie", 35);
        for(String nome : idades.keySet()) {
            Integer idade = idades.get(nome);
            System.out.println(nome + ": " + idade + " anos");
        }
    }
}
