package pl.sda.java.basic;

public class Samochod {
    private static final String UNIWERSALNY_KLUCZ = "kluczDoJazdyZwyklymSamochodem";

    private int iloscKol = 4;
    private String kolor = "biały";
    private String marka;
    private boolean czySprawnyTechnicznie = true;

    public Samochod(String marka) {
        this.marka = marka;
    }


    public boolean jedz(String kluczyk) {
        if (UNIWERSALNY_KLUCZ.equals(kluczyk)) {
            return true; // Jedziemy
        } else {
            return false; // Nie jedziemy
        }
    }
}
