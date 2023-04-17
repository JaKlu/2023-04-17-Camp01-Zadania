package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
 * Wynikiem działania programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5.
 * Zakres losowych liczb 0 - 10.
 */
public class Zadanie05 {
    public static void main(String[] args) {
        int tableSize = 10;
        int intToFind = 5;
        int minBound = 0;
        int maxBound = 10;


        int[] tab = new int[tableSize];
        int counter = 0;
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(minBound, maxBound + 1);
            if (tab[i] == intToFind) {
                counter++;
            }
        }
        printTable(tab);
        System.out.printf("Number of occurrences of the number %d: %2d", intToFind, counter);
    }

    public static void printTable(int[] table) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            sb.append(table[i]);
            if (i < table.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }

}
