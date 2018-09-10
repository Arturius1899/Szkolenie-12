package pl.sda.java.basic.inheritance;

/**
 * @author Michal Jaszczyk
 **/
public class Octavia extends Skoda {

    public Octavia() {
        // Niejawnie wywoływany jest bezparametrowy konstruktor z klasy Skoda
        System.out.println("Tworzę obiekt typu Octavia");
    }

    @Override
    public void jedz() { // Przeciażenie metody z klasy bazowej
        System.out.println("Jedz z klasy Octavia");
    }

    public void jedz(int predkosc) {
        System.out.println("Jedz z klasy Octavia z predkoscia " + predkosc);
    }
}
