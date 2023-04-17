package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który losuje dwie tablice (10 elementów, zakres 0 - 100).
 * Wynikiem działania programu mają być wypisane obie tablice,
 * oraz trzecia tablica w które każdy element jest sumą odpowiadających elementów z dwóch pierwszych tablic.
 * Przykład:
 * 1 4 4 64 45
 * 23 32 5 23 3
 * 24 36 9 87 48
 */
public class Zadanie09 {
    public static void main(String[] args) {
        int tableSize = 10;
        int minBound = 0;
        int maxBound = 100;

        int[] tab1 = new int[tableSize];
        int[] tab2 = new int[tableSize];
        int[] tab3 = new int[tableSize];
        Random random = new Random();

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random.nextInt(minBound, maxBound + 1);
            tab2[i] = random.nextInt(minBound, maxBound + 1);
            tab3[i] = tab1[i] + tab2[i];
        }

        printTable(tab1);
        printTable(tab2);
        printTable(tab3);
    }

    public static void printTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%4d", table[i]);
        }
        System.out.println();
    }
}
