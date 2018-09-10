package pl.sda.java.basic;

import java.util.ArrayList;

public class MainDziedziczenie {
    public static void main(String[] args) {
        Samochod volvo = new Samochod("Volvo");

        Mercedes mojMercedes = new Mercedes();
        Samochod innySamochod = new Mercedes();
        System.out.println("Czy jedziemy? " + innySamochod.jedz("kluczDoJazdyMercedesem"));
        System.out.println("Czy jedziemy? " + mojMercedes.jedz("kluczDoJazdyMercedesem"));
        System.out.println("Czy jedziemy? " + volvo.jedz("kluczDoJazdyZwyklymSamochodem"));

        ArrayList<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(innySamochod);
        listaSamochodow.add(volvo);
        listaSamochodow.add(mojMercedes);
        for (Samochod kolejnySamochod : listaSamochodow) {
            System.out.println(kolejnySamochod.jedz("kluczDoJazdyMercedesem"));
        }

        mojMercedes.drift();
        ((Mercedes) innySamochod).drift();
        if (volvo instanceof Mercedes) {
            ((Mercedes) volvo).drift();
        } else {
            System.out.println("To nie jest Mercedes");
        }

    }
}
