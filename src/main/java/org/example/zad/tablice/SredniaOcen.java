package org.example.zad.tablice;


import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę uczniów: ");
        int liczbaUczniow = scanner.nextInt();

        System.out.print("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotow = scanner.nextInt();

        double[][] oceny = new double[liczbaUczniow][liczbaPrzedmiotow];

        // Wczytywanie ocen od użytkownika
        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.println("Uczeń " + (i + 1) + ":");
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.print("Podaj ocenę z przedmiotu " + (j + 1) + ": ");
                oceny[i][j] = scanner.nextDouble();
            }
        }

        // Obliczanie średnich ocen dla każdego ucznia
        for (int i = 0; i < liczbaUczniow; i++) {
            double sumaOcen = 0;
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                sumaOcen += oceny[i][j];
            }
            double srednia = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Średnia ocen dla ucznia " + (i + 1) + ": " + srednia);
        }

        // Obliczanie ogólnej średniej dla każdego przedmiotu
        for (int j = 0; j < liczbaPrzedmiotow; j++) {
            double sumaOcen = 0;
            for (int i = 0; i < liczbaUczniow; i++) {
                sumaOcen += oceny[i][j];
            }
            double srednia = sumaOcen / liczbaUczniow;
            System.out.println("Średnia ocen z przedmiotu " + (j + 1) + ": " + srednia);
        }
    }
}

