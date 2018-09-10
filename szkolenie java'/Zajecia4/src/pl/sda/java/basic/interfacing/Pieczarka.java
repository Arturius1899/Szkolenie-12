package pl.sda.java.basic.interfacing;

public class Pieczarka extends Grzyb implements Jadalny {

    @Override
    public void zjedz() { // Implementacja metody z interfejsu Jadalny
        System.out.println("zjadam grzyba");
    }

    @Override
    public void mniam() { // Implementacja metody z interfejsu Smaczny, po którym dziedziczy Jadalny
        System.out.println("bardzo smaczne");
    }
}
