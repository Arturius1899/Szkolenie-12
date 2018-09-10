package pl.sda.java.basic.owoc;

public class Wisnia extends Owoc {
    public Wisnia() {
        super("Wisnia");
    }
    @Override
    public String smak() {
        return "kwasny";
    }

    @Override
    public String wielkosc() {
        return "bardzo maly";
    }

    @Override
    public String kolor() {
        return "wiśniowy";
    }
    
}
