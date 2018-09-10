package pl.sda.java.basic;

public class Mercedes extends Samochod {

    private static final String KLUCZ_DO_MERCEDESA = "kluczDoJazdyMercedesem";

    public Mercedes() {
        super("Mercedes"); // Wywowłanie konstruktora w klasie Samochod
    }

    public void drift() {
        System.out.println("Drift");
    }

    @Override
    public boolean jedz(String kluczyk) {
        return KLUCZ_DO_MERCEDESA.equals(kluczyk);
    }
}
