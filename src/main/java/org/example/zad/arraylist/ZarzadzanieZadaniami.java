package org.example.zad.arraylist;

import java.util.ArrayList;
import java.util.Scanner;



public class ZarzadzanieZadaniami {
    public static void main(String[] args) {
        ArrayList<Zadanie> listaZadan = new ArrayList<>();
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
                        for (int i = 0; i < listaZadan.size(); i++) {
                            Zadanie zadanie = listaZadan.get(i);
                            System.out.println((i + 1) + ". " + zadanie.getNazwa() + " (" +
                                    (zadanie.czyZakonczone() ? "Zakończone" : "Niezakończone") + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Podaj numer zadania do oznaczenia jako zakończone (1, 2, ...): ");
                    int numerZadania = scanner.nextInt();
                    if (numerZadania >= 1 && numerZadania <= listaZadan.size()) {
                        Zadanie zadanie = listaZadan.get(numerZadania - 1);
                        zadanie.oznaczJakoZakonczone();
                        System.out.println("Oznaczono zadanie jako zakończone: " + zadanie.getNazwa());
                    } else {
                        System.out.println("Niepoprawny numer zadania.");
                    }
                    break;
                case 4:
                    ArrayList<Zadanie> zadaniaDoUsuniecia = new ArrayList<>();
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

