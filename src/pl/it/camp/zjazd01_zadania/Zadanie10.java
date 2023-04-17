package pl.it.camp.zjazd01_zadania;

/**
 * Napisac program w którym są 3 zmienne:
 * s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
 * k - liczba całkowita - oznacza krok w ciągu arytmetycznym
 * n - liczba całkowita - oznacza ilość elementów ciągu.
 * Program ma zwracać sumę elementów takiego ciągu. Przykład:
 * s = 3, k = 5, n = 4
 * program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
 * 3, 8, 13, 18
 * następnie je sumuje i podaje wynik: 42.
 * Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)
 */
public class Zadanie10 {
    public static void main(String[] args) {
        int s = 3;
        int k = 5;
        int n = 4;

        int[] arithmeticProgression = new int[n];
        arithmeticProgression[0] = s;
        int sum = s;
        for (int i = 1; i < arithmeticProgression.length; i++) {
            arithmeticProgression[i] = arithmeticProgression[i - 1] + k;
            sum += arithmeticProgression[i];
        }
        printTable(arithmeticProgression);
        System.out.println("Sum: " + sum);
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
