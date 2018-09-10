package pl.sda.java.basic;

public class Audi extends Samochod {

    private static final String KLUCZ_DO_AUDI = "kluczDoJazdyAudi";

    public Audi() {
        super("Audi"); // Wywowłanie konstruktora w klasie Samochod
    }

    public void wlacz6bieg() {
        System.out.println("Zabojcza predkosc");
    }

    @Override
    public boolean jedz(String kluczyk) {
        return KLUCZ_DO_AUDI.equals(kluczyk);
    }
}
