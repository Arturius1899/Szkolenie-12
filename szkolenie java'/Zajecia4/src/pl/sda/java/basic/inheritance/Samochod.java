package pl.sda.java.basic.inheritance;

/**
 * @author Michal Jaszczyk
 **/
public class Samochod {

    public Samochod() {
        System.out.println("Tworzę obiekt typu Samochod");
    }

    public Samochod(int liczbaKol) {
        System.out.println("Samochod z " + liczbaKol + " kolami");
    }

    public void jedz() {
        System.out.println("Jedz z klasy Samochod");
    }
}
