package pl.sda.training.java;

import java.util.Objects;

public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;
    private char plec;

    public Osoba(String imie, String nazwisko, int wiek, char plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public char getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

//    @Override
//    public boolean equals(Object dowolnaInstancjaKlasy) {
////        if (dowolnaInstancjaKlasy instanceof Osoba)
//        Osoba innaOsoba = (Osoba) dowolnaInstancjaKlasy;
//        boolean czyToSamoImie = this.imie.equals(innaOsoba.imie);
//        boolean czyToSamoNazwisko = this.nazwisko.equals(innaOsoba.nazwisko);
//
//        return czyToSamoImie && czyToSamoNazwisko;
////        return toString().equals(innaOsoba.toString());
//    }

    public boolean equals(Osoba osoba) {
        return this.imie.equals(osoba.imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return plec == osoba.plec &&
                Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, plec);
    }
}
