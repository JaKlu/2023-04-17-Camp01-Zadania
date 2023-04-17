package pl.it.camp.zjazd01_zadania;

/**
 * Napisz program który ma dwie zmienne:
 * weight - waga, liczba całkowita
 * height - wzrost, liczba całkowita
 * program ma obliczać BMI (wskaźnik masy ciała, wzór do znalezienia w internecie, gdybyście nie znaleźli to piszcie)
 * i na podstawie wyliczonego BMI wypisywać "Nadwaga, Niedowaga, W normie itp.
 */
public class Zadanie12 {
    public static void main(String[] args) {
        int weightKg = 80;
        int heightCm = 180;

        double bmi = (double) weightKg / (((double) heightCm / 100) * ((double) heightCm / 100));

        System.out.printf("Weight: %d [kg]%n" +
                        "Height: %d [cm]%n" +
                        "BMI: %.2f - %s",
                weightKg, heightCm, bmi, getBmiDescription(bmi));
    }

    public static String getBmiDescription(double bmi) {
        if (bmi < 16) {
            return "wygłodzenie";
        } else if (bmi >= 16 && bmi < 17) {
            return "wychudzenie";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "niedowaga";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "wartość prawidłowa";
        } else if (bmi >= 25 && bmi < 30) {
            return "nadwaga";
        } else if (bmi >= 30 && bmi < 35) {
            return "otyłość I stopnia";
        } else if (bmi >= 35 && bmi < 40) {
            return "otyłość II stopnia";
        } else {
            return "otyłość III stopnia";
        }
    }
}
