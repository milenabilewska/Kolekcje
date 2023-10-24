package org.example.zad.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZarzadzanieZadaniami {
    public static void main(String[] args) {
        Map<Integer, Zadanie> listaZadan = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int numerZadania = 1;

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
                    scanner.nextLine();
                    String nazwa = scanner.nextLine();
                    Zadanie noweZadanie = new Zadanie(nazwa);
                    listaZadan.put(numerZadania, noweZadanie);
                    System.out.println("Dodano nowe zadanie: " + nazwa);
                    numerZadania++;
                    break;
                case 2:
                    if (listaZadan.isEmpty()) {
                        System.out.println("Lista zadań jest pusta.");
                    } else {
                        System.out.println("Lista zadań:");
                        for (Map.Entry<Integer, Zadanie> entry : listaZadan.entrySet()) {
                            Zadanie zadanie = entry.getValue();
                            System.out.println(entry.getKey() + ". " + zadanie.getNazwa() + " (" +
                                    (zadanie.czyZakonczone() ? "Zakończone" : "Niezakończone") + ")");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Podaj numer zadania do oznaczenia jako zakończone (1, 2, ...): ");
                    int numerDoOznaczenia = scanner.nextInt();
                    Zadanie zadanie = listaZadan.get(numerDoOznaczenia);
                    if (zadanie != null) {
                        zadanie.oznaczJakoZakonczone();
                        System.out.println("Oznaczono zadanie jako zakończone: " + zadanie.getNazwa());
                    } else {
                        System.out.println("Niepoprawny numer zadania.");
                    }
                    break;
                case 4:
                    Map<Integer, Zadanie> zadaniaDoUsuniecia = new HashMap<>();
                    for (Map.Entry<Integer, Zadanie> entry : listaZadan.entrySet()) {
                        if (entry.getValue().czyZakonczone()) {
                            zadaniaDoUsuniecia.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry<Integer, Zadanie> entry : zadaniaDoUsuniecia.entrySet()) {
                        listaZadan.remove(entry.getKey());
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

