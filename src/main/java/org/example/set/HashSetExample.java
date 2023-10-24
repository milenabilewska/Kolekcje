package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // Tworzenie HashSet przechowującego liczby całkowite
        Set<Integer> mojHashSet = new HashSet<>();

        // Dodawanie elementów do HashSet
        mojHashSet.add(1);
        mojHashSet.add(2);
        mojHashSet.add(3);

        // Dodawanie duplikatu - zostanie zignorowany
        mojHashSet.add(2);

        // Rozmiar HashSet
        int rozmiarHashSet = mojHashSet.size();
        System.out.println("Rozmiar HashSet: " + rozmiarHashSet);

        // Sprawdzanie, czy HashSet zawiera konkretny element
        boolean czyZawiera = mojHashSet.contains(3);
        System.out.println("Czy HashSet zawiera 3? " + czyZawiera);

        // Usuwanie elementu z HashSet
        mojHashSet.remove(2);

        // Iterowanie przez HashSet i wyświetlanie jego zawartości
        System.out.println("Zawartość HashSet:");
        for (Integer liczba : mojHashSet) {
            System.out.println(liczba);
        }
    }
}

