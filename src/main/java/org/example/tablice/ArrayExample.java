package org.example.tablice;

public class ArrayExample {
    public static void main(String[] args) {
        // Przykład tablicy jednowymiarowej (array)
        int[] oneDimensionalArray = new int[5];
        oneDimensionalArray[0] = 1;
        oneDimensionalArray[1] = 2;
        oneDimensionalArray[2] = 3;
        oneDimensionalArray[3] = 4;
        oneDimensionalArray[4] = 5;

        System.out.println("Tablica jednowymiarowa:");
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            System.out.println("Element " + i + ": " + oneDimensionalArray[i]);
        }

        // Przykład tablicy wielowymiarowej (array of arrays)
        int[][] twoDimensionalArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDimensionalArray[i][j] = i + j;
            }
        }

        System.out.println("\nTablica wielowymiarowa:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element [" + i + "][" + j + "]: " + twoDimensionalArray[i][j]);
            }
        }
    }
}
