package pl.it.camp.zjazd01_zadania;

import java.util.Random;

/**
 * Napisz program który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości jak w monopoly).
 * Program ma wykonać 10 000 rzutów i wypisać liczbę która wypadała najczęściej
 * (ta liczba jest oczywiście sumą oczek na dwóch kościach które symulujemy.
 */
public class Zadanie13 {
    public static void main(String[] args) {
        int numberOfThrows = 10000;
        int lowestNoOnDice = 1;
        int highestNoOnDice = 8;

        int[] scores = new int[numberOfThrows];
        int[] stats = new int[2 * highestNoOnDice - 1];

        Random random = new Random();
        int dice1, dice2;

        for (int i = 0; i < scores.length; i++) {
            dice1 = random.nextInt(lowestNoOnDice, highestNoOnDice + 1);
            dice2 = random.nextInt(lowestNoOnDice, highestNoOnDice + 1);
            scores[i] = dice1 + dice2;
        }

        //printTable(scores);
        System.out.printf("Throwing two %d-side dice a %d times.%n", highestNoOnDice, numberOfThrows);

        int count;

        for (int j = 2 * lowestNoOnDice; j <= 2 * highestNoOnDice; j++) {
            count = 0;
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == j) {
                    count++;
                    stats[j - 2] = count;
                }
            }
            //Occurrence table
            System.out.printf("\tSum = %2d, Occurence = %" + String.valueOf(numberOfThrows).length() + "d%n", j, count);

        }

        int highestOccurrence = stats[0];
        int sumIndex = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] > highestOccurrence) {
                highestOccurrence = stats[i];
                sumIndex = i;
            }
        }
        System.out.printf("Most common sum: %2d, Occurrence: %2d%n", sumIndex + 2, stats[sumIndex]);
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
