package org.example.listy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample{

    public static void main(String[] args) {
        // Tworzenie listy typu ArrayList przechowującej liczby całkowite
        List<Integer> mojaLista = new ArrayList<>();

        // Dodawanie elementów do listy
        mojaLista.add(1);
        mojaLista.add(2);
        mojaLista.add(3);

        // Pobieranie elementu z listy na podstawie indeksu
        int pierwszyElement = mojaLista.get(0);
        System.out.println("Pierwszy element: " + pierwszyElement);

        // Usuwanie elementu z listy
        mojaLista.remove(1); // Usuwa drugi element (indeks 1)

        // Iterowanie przez listę i wyświetlanie jej zawartości
        for (Integer liczba : mojaLista) {
            System.out.println(liczba);
        }

        // Sprawdzenie rozmiaru listy
        int rozmiarListy = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy);
    }
}
