package pl.sda.java.basic;

public class KierownikFabryki {
    private Samochod samochodSluzbowy;

    public KierownikFabryki() {
        samochodSluzbowy = new Mercedes();
    }

    public void przyjedzDoPracy() {
        samochodSluzbowy.jedz("kluczyk");
    }
}
