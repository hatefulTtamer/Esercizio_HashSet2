/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
*/

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> animals = createHashSet();
        if (animals.contains("Chicken") || animals.contains("Cow") || animals.contains("Parrot") || animals.contains("Dog") || animals.contains("Cat")) {
            System.out.println("Animal is part of the set.");
        } else {
            System.out.println("Animal is not part of the set.");
        }

    }

    public static HashSet<String> createHashSet() {
        HashSet<String> example = new HashSet<>();
        example.add("Chicken");
        example.add("Cow");
        example.add("Parrot");
        example.add("Dog");
        example.add("Cat");
        return example;
    }
}