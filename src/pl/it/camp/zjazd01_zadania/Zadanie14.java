package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który generuje tablicę liczb 0 i 1 (10 elementów).
 * Program ma sprawdzić czy tablica jest symetryczna -
 * pierwszy element taki jak ostatni, drugi taki jak przedostatni itd.
 * Wynikiem działania programu ma być wypisana wygenerowana tablica
 * oraz true albo false w zależności czy jest symetria czy nie.
 */
public class Zadanie14 {
    public static void main(String[] args) {
        int tabLength = 10;
        int tabQuantity = 20;

        Random random = new Random();
        int isFalse = 0;
        boolean isSymmetric;

        for (int i = 0; i < tabQuantity; i++) {
            int[] tab = new int[tabLength];
            for (int j = 0; j < tab.length; j++) {
                if (random.nextBoolean()) {
                    tab[j] = 1;
                } else {
                    tab[j] = 0;
                }
            }
            printTable(tab);

            isSymmetric = true;
            for (int j = 0; j <= tab.length / 2; j++) {
                if (!(tab[j] == tab[tab.length - 1 - j])) {
                    isSymmetric = false;
                    isFalse++;
                    break;
                }
            }
            System.out.println(" " + isSymmetric);
        }
        System.out.printf("\tTrue ratio: %.0f%%", (((double) tabQuantity - (double) isFalse) / (double) tabQuantity) * 100);
    }

    public static void printTable(int[] table) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            sb.append(table[i]);
            if (i < table.length - 1) {
                sb.append(", ");
            }
        }
        System.out.print(sb);
    }
}
