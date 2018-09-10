package pl.sda.java.basic;

public class PrzykladKlasy {
    private int liczba;
    private double liczbaDouble;
    private float liczbaFloat;
    private char znak;

    private String ciagZnakow;

    private int[] tablicaLiczbCalkowitych;

    public void przykladowaMetoda() {
        int zmiennaTymczasowa = 10;
    }

    public void dajJesc(int liczbaTorebekZJedzeniem) {
        if (liczbaTorebekZJedzeniem >= 3) {
            // 3 torebki jedzenia to znaczy, że pies jest szczęśliwy
            System.out.println("pies jest szczesliwy");
        } else if (liczbaTorebekZJedzeniem == 0) {
            System.out.println("pies jest smutny");
        } else { // 1 lub 2
            System.out.println("pies jest tak jak zazwyczaj");
        }
    }

    public String merdajOgonem(int dlugoscGlaskaniaWSekundach) {
        if (dlugoscGlaskaniaWSekundach > 60) {
            return "mocno merdam";
        }

        return "merdam jak zazwyczaj";
    }

    public int przykladowaMetoda(int argumentPierwszy, float argumentDrugi, double argumentTrzeci) {
        return (int) (argumentPierwszy + argumentDrugi + argumentTrzeci);
    }


    public int suma() {
//        tablicaLiczbCalkowitych = new int[5];
        tablicaLiczbCalkowitych = new int[]{5,3,8,123,444};

        int wynik = 0;
        for (int licznik = 0; licznik < tablicaLiczbCalkowitych.length; licznik++) {
            wynik = wynik + tablicaLiczbCalkowitych[licznik];
        }

        return wynik;
    }
}
