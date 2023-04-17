package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb.
 * Program ma wygenerować druga tablicę która jest pierwszą tablicą w odwrotnej kolejności.
 * Wynikiem działania programu ma być wyświetlona pierwsza i druga tablica.
 * Przykłady:
 * 3, 23, 2, 23, 53
 * 53, 23, 2, 23, 3
 * 45, 23, 65, 1, 54
 * 54, 1, 65, 23, 45
 * Zakres losowych liczb 0 - 100.
 */
public class Zadanie07 {
    public static void main(String[] args) {
        int tableSize = 10;
        int minBound = 0;
        int maxBound = 100;

        int[] tab = new int[tableSize];
        int[] reverseTab = new int[tableSize];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = reverseTab[tab.length - 1 - i] = random.nextInt(minBound, maxBound + 1);
        }
        printTable(tab);
        printTable(reverseTab);
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
