package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb.
 * Wynikiem działania programu ma być wyświetlona tablica oraz najmniejsza liczba z tej tablicy.
 * Zakres losowych liczb 0 - 100.
 */

public class Zadanie03 {
    public static void main(String[] args) {
        int tableSize = 5;
        int minRandom = 0;
        int maxRandom = 100;

        int[][] tab = new int[tableSize][tableSize];
        Random random = new Random();

        int min = maxRandom + 1;
        for (int row = 0; row < tab.length; row++) {
            for (int column = 0; column < tab.length; column++) {
                tab[row][column] = random.nextInt(minRandom, maxRandom + 1);
                System.out.printf("%4d", tab[row][column]);
                if (tab[row][column] < min) {
                    min = tab[row][column];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Minimum value of array: " + min);
    }
}
