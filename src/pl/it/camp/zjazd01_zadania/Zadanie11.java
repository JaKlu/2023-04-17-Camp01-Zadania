package pl.it.camp.zjazd01_zadania;

/**
 * Napisz program który ma 3 zmienna a, b i c. Te zmienne to długości boków trójkąta.
 * Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
 * Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta.
 * Jak sprawdzić czy z podanych boków da się zbudować trójkąt znajdziecie w google pod hasłem:
 * "Nierówność trójkąta".
 */
public class Zadanie11 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean isTriangle = false;

        int[] sides = new int[]{a, b, c};
        int perimeter = a + b + c;
        int longestSide = a;

        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > longestSide) {
                longestSide = sides[i];
            }
        }
        if ((perimeter - longestSide) > longestSide) {
            isTriangle = true;
        }

        System.out.printf(isTriangle
                        ? "%b %nPerimeter of a triangle with sides: %d, %d, %d is equal to: %d"
                        : "%b",
                isTriangle, a, b, c, perimeter, isTriangle);
    }
}
