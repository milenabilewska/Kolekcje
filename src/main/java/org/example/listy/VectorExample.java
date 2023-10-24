package org.example.listy;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Tworzenie Vector przechowującej liczby całkowite
        Vector<Integer> mojVector = new Vector<>();

        // Dodawanie elementów do Vector
        mojVector.add(1);
        mojVector.add(2);
        mojVector.add(3);

        // Pobieranie elementu z Vector na podstawie indeksu
        int pierwszyElement = mojVector.get(0);
        System.out.println("Pierwszy element: " + pierwszyElement);

        // Usuwanie elementu z Vector
        mojVector.remove(1); // Usuwa drugi element (indeks 1)

        // Iterowanie przez Vector i wyświetlanie jego zawartości
        for (Integer liczba : mojVector) {
            System.out.println(liczba);
        }

        // Sprawdzenie rozmiaru Vector
        int rozmiarVector = mojVector.size();
        System.out.println("Rozmiar Vector: " + rozmiarVector);
    }
}

