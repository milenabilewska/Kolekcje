package org.example.listy;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Tworzenie LinkedList przechowującej łańcuchy znaków
        LinkedList<String> mojaLista = new LinkedList<>();

        // Dodawanie elementów na koniec listy
        mojaLista.add("Pierwszy element");
        mojaLista.add("Drugi element");
        mojaLista.add("Trzeci element");

        // Dodawanie elementu na początek listy
        mojaLista.addFirst("Nowy początek");

        // Dodawanie elementu na koniec listy
        mojaLista.addLast("Nowy koniec");

        // Usuwanie pierwszego elementu
        mojaLista.removeFirst();

        // Usuwanie ostatniego elementu
        mojaLista.removeLast();

        // Pobieranie elementu na podstawie indeksu
        String drugiElement = mojaLista.get(1);

        // Iterowanie przez listę i wyświetlanie jej zawartości
        for (String element : mojaLista) {
            System.out.println(element);
        }

        // Sprawdzenie rozmiaru listy
        int rozmiarListy = mojaLista.size();
        System.out.println("Rozmiar listy: " + rozmiarListy);
    }
}
