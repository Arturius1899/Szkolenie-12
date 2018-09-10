package pl.sda.java.basic.calc;


import java.util.Scanner;

/**
 * @author Michal Jaszczyk
 **/
public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
//        System.out.println("Dodawanie " + kalkulator.dodaj(3, 5));
//        System.out.println("Odejmowanie " + kalkulator.odejmij(3, 5));
//        System.out.println("Mnożenie " + kalkulator.pomnoz(3, 5));
//        System.out.println("Dzielenie " + kalkulator.podziel(3, 5));
//        System.out.println("Dzielenie " + kalkulator.podziel(3, 0));
//        System.out.println("Reszta z dzielenia " + kalkulator.reszta(3, 5));
//        System.out.println("Reszta z dzielenia " + kalkulator.reszta(3, 0));
//        System.out.println("Potęgowanie " + kalkulator.poteguj(3, 5));
//        System.out.println("Potęgowanie " + kalkulator.poteguj(3, 0));
//        System.out.println("Potęgowanie " + kalkulator.potegujRecznie(3, 5));
//        System.out.println("Potęgowanie " + kalkulator.potegujRecznie(3, 0));
//        int[] liczby = new int[]{1, 5, 12, 22};
//        int suma = kalkulator.suma(liczby);
//        System.out.println("Suma " + suma);
//        System.out.println("Max " + kalkulator.max(liczby));
//        System.out.println("Srednia " + kalkulator.srednia(liczby));

//        System.out.println("Dzielenie " + kalkulator.podziel(3, 2));
        System.out.println("Potęgowanie " + kalkulator.potegujRecznie(2, 3));
        System.out.println("Potęgowanie " + kalkulator.poteguj(2, 3));

        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(kalkulator.poteguj(a, b));
//        Kalkulator.poteguj(3, 5);
        kalkulator.poteguj(3, 5);
        Math.pow(3, 5);
    }
}
