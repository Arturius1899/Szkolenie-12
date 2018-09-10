package pl.sda.java.basic.inheritance;

/**
 * @author Michal Jaszczyk
 **/
public class Mercedes extends Samochod {

    public Mercedes() {
        // Niejawnie wywoływany jest bezparametrowy konstruktor z klasy Samochod
        System.out.println("Tworzę obiekt typu Mercedes");
    }

    public Mercedes(int liczbaKol) {
        super(liczbaKol); // Wywołanie konstruktora parametrowego z klasy bazowej (Samochod)
        System.out.println("Tworzę Mercedesa z " + liczbaKol + " kolami");
    }

    @Override
    public void jedz() { // Przeciażenie metody z klasy bazowej
        System.out.println("Jedz z klasy Mercedes");
    }
}
