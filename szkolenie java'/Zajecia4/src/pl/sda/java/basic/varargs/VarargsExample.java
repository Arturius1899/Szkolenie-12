package pl.sda.java.basic.varargs;

import java.util.ArrayList;

/**
 * @author Michal Jaszczyk
 **/
public class VarargsExample {

    public String sklejWyrazy(String... wyrazy) {
        String wynik = "";
        for (String wyraz : wyrazy) {
            wynik = wynik + wyraz;
        }
        return wynik;
    }

    public String sklejWyrazy(int iloscPowtorzen, String... wyrazy) {
        String wynik = "";
        for (String wyraz : wyrazy) {
            wynik = wynik + wyraz;
        }
        return wynik;
    }

    public String sklejWyrazy(ArrayList<String> wyrazy) {
        String wynik = "";
        for (String wyraz : wyrazy) {
            wynik = wynik + wyraz;
        }
        return wynik;
    }

    public int suma(int... liczby) {
        int wynik = 0;
        for (int liczba : liczby) {
            wynik = wynik + liczba;
        }
        return wynik;
    }

    public int suma(int liczba) {
        return -1;
    }

    public int mnozenie(int[] liczby) {
        int wynik = 0;
        for (int liczba : liczby) {
            wynik = wynik * liczba;
        }
        return wynik;
    }

    public int mnozenie() {
        return 0;
    }

    public int mnozenie(int pierwszaLiczba) {
        return 0;
    }

    public int mnozenie(int pierwszaLiczba, int drugaLiczba, int trzeciaLiczba) {
        return 0;
    }
}
