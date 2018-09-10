package pl.sda.java.basic.abstracting;

public abstract class KlasaAbstrakcyjna extends ZwyklaKlasa { // Klasa abstrakcyjna może rozszerzać dowolną klasę (nie tylko abstrakcyjną)

    private int pole1; // W klasie abstrakcyjnej można tworzyć pola o dowolnej widoczności
    private void prywatnaMetoda() { // W klasie abstrakcyjnej można tworzyć metody o dowolnej widoczności

    }
    protected abstract void jakasMetoda(); // jeżeli nie chcemy tworzyć implementacji metody dodajemy słowo kluczowe abstract

    public void innaMetoda() {
        System.out.println("ala ma kota");
    }
}
