package pl.sda.java.basic.solution.homework3.insurance;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Michal Jaszczyk
 **/
public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
//    private String dataUrodzenia;


    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    // Wygenerowane metody przez intellij (alt + insert -> equals and hashcode oraz toString)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, dataUrodzenia);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }
}
