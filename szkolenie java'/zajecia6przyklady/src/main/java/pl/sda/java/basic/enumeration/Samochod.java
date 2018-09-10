package pl.sda.java.basic.enumeration;

public class Samochod {
    private Kolor kolorSamochodu;

    public void pomalujNaCzerwony() {
        kolorSamochodu = Kolor.CZERWONY;
    }

    public void pomalujNaCzerwono2() {
        int liczba = Kolor.CZERWONY.getLiczba(); // w tym wypadku zawsze zostanie zwrócone 1, ponieważ dla obektu CZERWONY przypisana jest liczba 1
    }
}
