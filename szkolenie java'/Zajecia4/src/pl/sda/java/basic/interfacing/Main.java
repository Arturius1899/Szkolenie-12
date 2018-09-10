package pl.sda.java.basic.interfacing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Jadalny interfejsJadalny = new Jadalny(); // Nie da się stworzyć obiektu, który jest interfejsem
        String kolor = Jadalny.BIALY; // Stałe zdefiniowane w interfejsie można tylko odczytać

        Pieczarka poProstuPieczarka = new Pieczarka();
        poProstuPieczarka.zjedz(); // metoda zaimplementowane w klasie Pieczarka
        poProstuPieczarka.zbierz(); // metoda z klasy bazowej Grzyb
        poProstuPieczarka.obierz(); // metoda z interfejsu Jadalny

        Grzyb grzybPieczarka = new Pieczarka();
        grzybPieczarka.zbierz(); // metoda z klasy Grzyb
        ((Pieczarka) grzybPieczarka).zjedz();
        ((Jadalny) grzybPieczarka).zjedz();
        ((Jadalny) grzybPieczarka).obierz();
//        new Grzyb(); // Nie da się utworzyć obiektu klasy abstrakcyjnej
        Jadalny jadalnaPieczarka = new Pieczarka();
        jadalnaPieczarka.obierz(); // metoda z interfejsu Jadalny
        jadalnaPieczarka.zjedz(); // metoda z interfejsu Jadalny (implementacja z klasy Pieczarka)
        ((Pieczarka) jadalnaPieczarka).zbierz();

        ArrayList<Jadalny> jadalneObiekty = new ArrayList<>();
        jadalneObiekty.add(jadalnaPieczarka);
        jadalneObiekty.add(poProstuPieczarka);
//        jadalneObiekty.add(new Muchomor()); // Muchomor nie ma nic wspólnego z interfejsem Jadalny, więc nie można go dodać
        for (Jadalny jadalny : jadalneObiekty) {
            jadalny.zjedz();
            jadalny.obierz();
        }

        ArrayList<Grzyb> listaGrzybow = new ArrayList<>();
        listaGrzybow.add(grzybPieczarka);
        listaGrzybow.add(poProstuPieczarka);
//        listaGrzybow.add(jadalnaPieczarka); // Zmienna typu Jadalny nie ma nic wspólnego z klasą Grzyb, więc nie można jej dodać
        listaGrzybow.add(new Muchomor());
    }
}
