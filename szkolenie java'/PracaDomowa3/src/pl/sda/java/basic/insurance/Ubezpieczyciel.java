package pl.sda.java.basic.solution.homework3.insurance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Michal Jaszczyk
 **/
public class Ubezpieczyciel {

    private Map<String, Osoba> osobyUbezpieczone = new HashMap<>();

    public boolean dodajOsobe(String pesel, Osoba osoba) {
        // Sprawdzenie czy pesel jest liczbą, ma 11 znaków oraz pierwszy znak jest cyfrą (a nie + lub -)
        if (isNumeric(pesel) && pesel.length() == 11 && Character.isDigit(pesel.charAt(0))) {
            Osoba istniejacaOsoba = osobyUbezpieczone.putIfAbsent(pesel, osoba); // metoda ta doda osobę pod danym peselu tylko jeśli tego peselu nie było jeszcze w mapie
            return istniejacaOsoba == null; // jeżeli metoda putIfAbsent zwróciła null to znaczy, że pod podanym pselem nie było osoby i dodanie się udało
        }
        return false; // jeżeli podany psel nie jest liczbą, jego długość jest różna od 11 lub na pierwszym znaku jest + lub - to zwracamy false
    }

    public Osoba znajdzOsobe(String pesel) {
        return osobyUbezpieczone.get(pesel); // zwracamy osobę o podanym peselu
    }

    public boolean aktualizujOsobe(String pesel, Osoba osoba) {
        Osoba istniejacaOsoba = osobyUbezpieczone.replace(pesel, osoba); // replace zamieni osobę pod podanym pselem tylko jeżeli dany pesel jest w mapie
        return istniejacaOsoba != null; // jeżeli metoda replace zwróciła null, oznacza to, że nie było osoby pod podanym peselem
    }

    private boolean isNumeric(String str) {
        try {
            long d = Long.parseLong(str); // Zamieniamy String na Long. W przypadku jeżeli ta operacja się powiedzie zwracamy true
            return true;
        } catch (NumberFormatException nfe) {
            return false; // Zwracamy false w przypadku jak podany String nie jest liczbą
        }
    }
}
