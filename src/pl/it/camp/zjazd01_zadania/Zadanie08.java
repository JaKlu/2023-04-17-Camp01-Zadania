package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który generuje dwie tablice (10 elementów) losowych liczb.
 * Wynikiem działania programu mają być wyświetlone obie tablice
 * oraz trzecia tablica będąca połączeniem dwóch wygenerowanych.
 * Przykład:
 * 3, 5, 12, 34, 45
 * 45, 21, 65, 23, 1
 * 3, 5, 12, 34, 45, 45, 21, 65, 23, 1
 */
public class Zadanie08 {
    public static void main(String[] args) {
        int tableSize = 10;
        int minBound = 0;
        int maxBound = 100;

        int[] tab1 = new int[tableSize];
        int[] tab2 = new int[tableSize];
        int[] tab3 = new int[2 * tableSize];
        Random random = new Random();

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = tab3[i] = random.nextInt(minBound, maxBound + 1);
            tab2[i] = tab3[i + tableSize] = random.nextInt(minBound, maxBound + 1);
        }

        printTable(tab1);
        printTable(tab2);
        printTable(tab3);
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
