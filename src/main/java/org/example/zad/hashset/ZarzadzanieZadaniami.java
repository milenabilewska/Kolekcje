package org.example.zad.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZarzadzanieZadaniami {
    public static void main(String[] args) {
        Set<Zadanie> listaZadan = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWybierz operację:");
            System.out.println("1. Dodaj nowe zadanie");
            System.out.println("2. Wyświetl listę zadań");
            System.out.println("3. Oznacz zadanie jako zakończone");
            System.out.println("4. Usuń zakończone zadania");
            System.out.println("5. Wyjście");

            int wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj nazwę nowego zadania: ");
                    String nazwa = scanner.nextLine();
                    Zadanie noweZadanie = new Zadanie(nazwa);
                    if (listaZadan.contains(noweZadanie)) {
                        System.out.println("To zadanie już istnieje.");
                    } else {
                        listaZadan.add(noweZadanie);
                        System.out.println("Dodano nowe zadanie: " + nazwa);
                    }
                    break;
                case 2:
                    if (listaZadan.isEmpty()) {
                        System.out.println("Lista zadań jest pusta.");
                    } else {
                        System.out.println("Lista zadań:");
                        for (Zadanie zadanie : listaZadan) {
                            System.out.println(zadanie.getNazwa() + " (" +
                                    (zadanie.czyZakonczone() ? "Zakończone" : "Niezakończone") + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Podaj nazwę zadania do oznaczenia jako zakończone: ");
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
                    Set<Zadanie> zadaniaDoUsuniecia = new HashSet<>();
                    for (Zadanie zadanie : listaZadan) {
                        if (zadanie.czyZakonczone()) {
                            zadaniaDoUsuniecia.add(zadanie);
                        }
                    }
                    listaZadan.removeAll(zadaniaDoUsuniecia);
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
