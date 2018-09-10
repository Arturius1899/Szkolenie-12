package pl.sda.java.basic.inheritance;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        Samochod zwyklySamochod = new Samochod(); // Wywołanie konstruktora Samochod
        zwyklySamochod.jedz();
        Mercedes mercedes = new Mercedes(); // Wywołanie konsturktora Samochod oraz Mercedes
        System.out.println("-------------");
        Mercedes mercedes2 = new Mercedes(3); // Wywolanie parametrowego konstruktora Samochod oraz Mercedes
        mercedes.jedz();
        Skoda skoda = new Skoda(); // Wywołanie konsturktora Samochod oraz Skoda
        skoda.jedz();
        Octavia octavia = new Octavia(); // Wywołanie konsturktora Samochod, Skoda oraz Octavia
        octavia.jedz();
        Samochod jakisSamochod = new Samochod();
        Samochod jakisSamochod2 = new Skoda();
        Samochod jakisSamochod3 = new Octavia();

        jakisSamochod.jedz();
        jakisSamochod2.jedz();
        jakisSamochod3.jedz();
        ((Octavia) jakisSamochod3).jedz(140); // Rzutowanie zmiennej typu Samochod na klasę Octavia

        Octavia jakasOctavia = new Octavia();
        jakasOctavia.jedz();
        jakasOctavia.jedz(140);
    }
}
