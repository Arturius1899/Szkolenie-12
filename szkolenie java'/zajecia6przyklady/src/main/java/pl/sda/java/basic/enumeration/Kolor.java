package pl.sda.java.basic.enumeration;

public enum Kolor {
    CZERWONY(1), // Zdefiniowane obiekty enuma Kolor. Dostęp do nich jest taki sam jak dla publicznych stałych statycznych
    CZARNY(3), // W nawiasie podaje się pramatry dla konstruktora
    ZIELONY(123); // Można korzystać tylko ze zdefiniowanych obiektów. Nie można stworzyć nowego obiektu za pomocą new

    private int liczba; // można przechowywać dowolne pola

    // w enumie konstruktor zawsze jest prywatny
    private Kolor(int liczba) {
        this.liczba = liczba;
    }

    // można tworzyć dowolne metody
    public int getLiczba() {
        return liczba;
    }

    // przykład pobierania odpowiedniego koloru na podstawie pola liczba, która jest zdefiniowane dla każdego z kolorów
    public Kolor pobierzKolor(int liczba) {
        for (Kolor kolor : values()) { // values() zwraca wszystkie możliwe obiekty enuma Kolor
            if( kolor.getLiczba() == liczba) { // sprawdzamy czy podana liczba jest taka sama jak ta zdefiniowana w kolejnym kolorze
                return kolor; // jeśli tak to zwracamy ten kolor (dla liczb 3 będzie to CZARNY)
            }
        }
        return null;
    }
}
