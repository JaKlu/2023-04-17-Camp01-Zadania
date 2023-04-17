package pl.it.camp.zjazd01_zadania;

/**
 * Wypisz na ekranie liczby od 0 do 99.
 * Jeśli liczba jest podzielna przez 3 obok liczny dopisz "Fizz",
 * jeśli liczba jest podzielna przez 5 obok liczby dopisz "Buzz",
 * jeśli liczba jest podzielna przez 3 i 5 obok liczby dopisz "Fizz Buzz".
 * Przykład:
 * 1
 * 2
 * 3 Fizz
 * 4
 * 5 Buzz
 * 6 Fizz
 * 7
 * 8
 * 9 Fizz
 * 10
 * 11
 * 12 Fizz
 * 13
 * 14
 * 15 Fizz Buzz
 * 16
 * itd.
 */
public class Zadanie06 {
    public static void main(String[] args) {
        int minBound = 0;
        int maxBound = 99;

        int fizz = 3;
        int buzz = 5;

        for (int i = minBound; i <= maxBound; i++) {
            if (i % (fizz * buzz) == 0) {
                System.out.println(i + " Fizz Buzz");
            } else if (i % fizz == 0) {
                System.out.println(i + " Fizz");
            } else if (i % buzz == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
