package pl.sda.java.basic.calc;

/**
 * @author Michal Jaszczyk
 **/
public class Kalkulator {

    public int dodaj(int a, int b) {
        return a + b;
    }

    public int odejmij(int a, int b) {
        return a - b;
    }

    public int pomnoz(int a, int b) {
        return a * b;
    }

    public float podziel(int a, int b) {
        if (b != 0) {
            return (float) a / (float) b;
        } else {
            return 0;
        }
    }

    public int reszta(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            return 0;
        }
    }

    public double poteguj(int a, int b) {
        return Math.pow(a, b);
    }

    public int potegujRecznie(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            int wynik = a;
            for (int i = 1; i < b; i++) {
                wynik = wynik * a;
            }
            return wynik;
        }
    }

    public int suma(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma = suma + liczba;
        }
        return suma;
    }

    public float srednia(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma = suma + liczba;
        }
        return suma / liczby.length;
    }

    public int max(int[] liczby) {
        int max = liczby[0];
        for (int i = 1; i < liczby.length; i++) {
            if (max < liczby[i]) {
                max = liczby[i];
            }
        }
        return max;
    }
}
