package pl.sda.java.basic.owoc;

public class Truskawka extends Owoc {

    public Truskawka() {
        super("Truskawka");
    }

    @Override
    public String smak() {
        return "bardzo slodki";
    }

    @Override
    public String wielkosc() {
        return "bardzo maly";
    }

    @Override
    public String kolor() {
        return "czerwona";
    }
}
