package pl.sda.java.basic.owoc;

public class Jablko extends Owoc {

    public Jablko() {
        super("Jablko");
    }

    @Override
    public String smak() {
        return "sslodko-kwasny";
    }

    @Override
    public String wielkosc() {
        return "srednia";
    }

    @Override
    public String kolor() {
        return "zielony";
    }
}
