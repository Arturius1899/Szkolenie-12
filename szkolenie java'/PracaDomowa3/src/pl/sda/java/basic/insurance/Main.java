package pl.sda.java.basic.solution.homework3.insurance;

import java.time.LocalDate;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        Ubezpieczyciel ubezpieczyciel = new Ubezpieczyciel();

        Osoba adamKowalski = new Osoba("Adam", "Kowalski", LocalDate.of(1970, 1, 1));
        Osoba abelardNowak = new Osoba("Abelard", "Nowak", LocalDate.of(1972, 11, 10));
        Osoba adamIksinski = new Osoba("Adam", "Iksinski", LocalDate.of(2018, 2, 28));
        // Dodawany pesel powinien być liczbą oraz zawierać 11 cyfr. Może zaczynać się od 0
        System.out.println(ubezpieczyciel.dodajOsobe("1", adamKowalski)); // za krotki pesel
        System.out.println(ubezpieczyciel.dodajOsobe("1", adamKowalski)); // za krotki pesel
        System.out.println(ubezpieczyciel.dodajOsobe("-1234567890", abelardNowak)); // niedopuszczalny znak w peselu
        System.out.println(ubezpieczyciel.dodajOsobe("+1234567890", adamIksinski)); // niedopuszczalny znak w peselu
        System.out.println(ubezpieczyciel.dodajOsobe("01234567890", adamIksinski)); // poprawne

        System.out.println(ubezpieczyciel.znajdzOsobe("01234567890")); // powinno znaleźć Adama Iksinskiego
        System.out.println(ubezpieczyciel.znajdzOsobe("2")); // brak osoby o podanym numerze pesel, więc wynik to null

        System.out.println(ubezpieczyciel.aktualizujOsobe("01234567890", abelardNowak)); // zmiana danych dla podanego peselu
        System.out.println(ubezpieczyciel.aktualizujOsobe("2", abelardNowak)); // nieudana zmiana danych, ponieważ pod podanym pselem nie ma osoby

        System.out.println(ubezpieczyciel.znajdzOsobe("01234567890")); // po aktualizacji zwraca Abelarda Nowaka

    }
}
