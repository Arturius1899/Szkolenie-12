package pl.sda.java.basic.owoc;

import java.util.Objects;

public abstract class Owoc {
    private String nazwa;

    public Owoc(String nazwaPodanaJakoArgument) {
        this.nazwa = nazwaPodanaJakoArgument;
    }

    public String smak() { // Można podać domyślną impementację
        return "slodki";
    }
    public abstract String kolor(); // Można dodać metodę bez implementacji. Wtedy klasa dziedzicząca musi ją dodać

    public String wielkosc() {
        return "maly";
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String twojaNowaNazwa) {
        if (twojaNowaNazwa.equals("Mandarynka")) {
            this.nazwa = twojaNowaNazwa;
        }
    }

    @Override
    public boolean equals(Object toCoPodajeUzytkownik) {
        Owoc zrzutowanyOwoc = (Owoc) toCoPodajeUzytkownik;
        return getNazwa().equals(zrzutowanyOwoc.getNazwa());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNazwa());
    }
}
