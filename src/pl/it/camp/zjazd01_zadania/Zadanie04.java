package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program generujący jednowymiarową tablicę (10 elementów) liczb
 * w której każda liczba jest losowa ale nie jest mniejsza niż poprzednia liczba. Przykłady:
 * 23, 34, 53, 60, 80
 * 0, 10, 70, 70, 70
 * nieprawidłowy wynik:
 * 34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
 * Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych liczb 0 - 20.
 */
public class Zadanie04 {
    public static void main(String[] args) {
        int tableSize = 10;
        int tableQuantity = 10;

        for (int q = 0; q < tableQuantity; q++) {
            int minBound = 0;
            int maxBound = 20;
            int[] tab = new int[tableSize];
            Random random = new Random();

            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(minBound, maxBound + 1);
                if (tab[i] >= minBound) {
                    minBound = tab[i];
                }
            }
            printTable(tab);
        }
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
