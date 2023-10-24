package org.example.listy;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Tworzenie stosu przechowującego łańcuchy znaków
        Stack<String> mojStack = new Stack<>();

        // Dodawanie elementów na stos
        mojStack.push("Element 1");
        mojStack.push("Element 2");
        mojStack.push("Element 3");

        // Pobieranie elementu ze stosu
        String ostatniElement = mojStack.pop();
        System.out.println("Ostatni element: " + ostatniElement);

        // Odczytywanie, ale nie usuwanie elementu ze stosu
        String elementNaWierzchu = mojStack.peek();
        System.out.println("Element na wierzchu: " + elementNaWierzchu);

        // Rozmiar stosu
        int rozmiarStosu = mojStack.size();
        System.out.println("Rozmiar stosu: " + rozmiarStosu);

        // Sprawdzenie, czy stos jest pusty
        boolean czyPusty = mojStack.isEmpty();
        System.out.println("Czy stos jest pusty? " + czyPusty);

        // Iterowanie przez stos i wyświetlanie jego zawartości
        System.out.println("Zawartość stosu:");
        while (!mojStack.isEmpty()) {
            System.out.println(mojStack.pop());
        }
    }
}

