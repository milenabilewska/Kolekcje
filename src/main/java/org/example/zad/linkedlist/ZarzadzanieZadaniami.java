package org.example.zad.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class ZarzadzanieZadaniami {
    public static void main(String[] args) {
        List<Zadanie> listaZadan = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWybierz operację:");
            System.out.println("1. Dodaj nowe zadanie");
            System.out.println("2. Wyświetl listę zadań");
            System.out.println("3. Oznacz zadanie jako zakończone");
            System.out.println("4. Usuń zakończone zadania");
            System.out.println("5. Wyjście");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj nazwę nowego zadania: ");
                    scanner.nextLine(); // Oczyszczamy bufor po wczytaniu liczby
                    String nazwa = scanner.nextLine();
                    Zadanie noweZadanie = new Zadanie(nazwa);
                    listaZadan.add(noweZadanie);
                    System.out.println("Dodano nowe zadanie: " + nazwa);
                    break;
                case 2:
                    if (listaZadan.isEmpty()) {
                        System.out.println("Lista zadań jest pusta.");
                    } else {
                        System.out.println("Lista zadań:");
                        ListIterator<Zadanie> iterator = listaZadan.listIterator();
                        while (iterator.hasNext()) {
                            Zadanie zadanie = iterator.next();
                            System.out.println(zadanie.getNazwa() + " (" +
                                    (zadanie.czyZakonczone() ? "Zakończone" : "Niezakończone") + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Podaj nazwę zadania do oznaczenia jako zakończone: ");
                    scanner.nextLine();
                    String zadanieDoOznaczenia = scanner.nextLine();
                    for (Zadanie zadanie : listaZadan) {
                        if (zadanie.getNazwa().equals(zadanieDoOznaczenia)) {
                            zadanie.oznaczJakoZakonczone();
                            System.out.println("Oznaczono zadanie jako zakończone: " + zadanie.getNazwa());
                            break;
                        }
                    }
                    break;
                case 4:
                    ListIterator<Zadanie> usuwaneIterator = listaZadan.listIterator();
                    while (usuwaneIterator.hasNext()) {
                        if (usuwaneIterator.next().czyZakonczone()) {
                            usuwaneIterator.remove();
                        }
                    }
                    System.out.println("Usunięto zakończone zadania.");
                    break;
                case 5:
                    System.out.println("Koniec programu.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Wybierz operację od 1 do 5.");
            }
        }
    }
}
