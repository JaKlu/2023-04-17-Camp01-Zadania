package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program generujący jednowymiarową tablice liczb (10 elementów).
 * rogram powinien posortować tablicę przy pomocy algorytmu sortowania przez wstawianie
 * lub przez wybranie (do wyboru, dla chętnych oba algorytmy).
 * Wynikiem działania programu ma być wyświetlona tablica przed sortowaniem oraz posortowana.
 */

public class Zadanie01 {

    public static void main(String[] args) {
        System.out.println("-".repeat(6) + " Sorting algorithms - Algorytmy sortowania " + "-".repeat(5));
        int tableSize = 10;

        int[] originalTable = new int[tableSize];
        int[] table;
        int counter;
        Random random = new Random();

        for (int i = 0; i < originalTable.length; i++) {
            originalTable[i] = random.nextInt(10, 100);
        }

        System.out.print("Original table: ");
        printTable(originalTable);

        System.out.println();
        System.out.println("-".repeat(4) + " Insertion sort - Sortowanie przez wstawianie " + "-".repeat(4));
        table = copyOfTable(originalTable);
        counter = 0;

        for (int current = 1; current < table.length; current++) {
            int elementToCompare = table[current];
            int previous = current - 1;
            while (previous >= 0 && table[previous] > elementToCompare) {
                table[previous + 1] = table[previous];
                previous--;
                counter++;
            }
            table[previous + 1] = elementToCompare;
        }
        System.out.print("--Sorted table: ");
        printTable(table, counter);

        System.out.println();
        System.out.println("-".repeat(4) + " Selection sort - Sortowanie przez wybieranie " + "-".repeat(4));
        table = copyOfTable(originalTable);
        counter = 0;

        int temp;
        for (int i = 0; i < table.length; i++) {
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[i]) {
                    temp = table[j];
                    table[j] = table[i];
                    table[i] = temp;
                    counter++;
                }
            }
        }
        System.out.print("--Sorted table: ");
        printTable(table, counter);
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

    public static void printTable(int[] table, int counter) {
        printTable(table);
        System.out.println("Liczba operacji: " + counter);
    }

    public static int[] copyOfTable(int[] table) {
        int[] newTable = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            newTable[i] = table[i];
        }
        return newTable;
    }
}
