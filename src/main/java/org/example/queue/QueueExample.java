package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Tworzenie kolejki przy użyciu LinkedList
        Queue<String> mojaKolejka = new LinkedList<>();

        // Dodawanie elementów do kolejki
        mojaKolejka.offer("Element 1");
        mojaKolejka.offer("Element 2");
        mojaKolejka.offer("Element 3");

        // Pobieranie elementu z przodu kolejki
        String pierwszyElement = mojaKolejka.poll();
        System.out.println("Pierwszy element: " + pierwszyElement);

        // Sprawdzanie, ale nie usuwanie elementu z przodu kolejki
        String elementNaPrzodzie = mojaKolejka.peek();
        System.out.println("Element na przodzie: " + elementNaPrzodzie);

        // Rozmiar kolejki
        int rozmiarKolejki = mojaKolejka.size();
        System.out.println("Rozmiar kolejki: " + rozmiarKolejki);

        // Iterowanie przez kolejkę i wyświetlanie jej zawartości
        System.out.println("Zawartość kolejki:");
        for (String element : mojaKolejka) {
            System.out.println(element);
        }
    }
}

