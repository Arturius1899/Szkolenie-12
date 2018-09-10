package pl.sda.training.java;

public class Indeks {
    private Osoba osoba;
    private float sredniaOcen;
    private int[] oceny;
//    private boolean zagrozenie;

    public Indeks(Osoba osoba) {
        this.osoba = osoba;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public float getSredniaOcen() {
        return sredniaOcen;
    }

    public int[] getOceny() {
        return oceny;
    }

    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }

    public float obliczSrednia() {
        // licznik = licznik + 1;
        // licznik++;
        // licznik += 1;
        // ++licznik;

        int wynik = 0;
        for (int licznik = 0; licznik < oceny.length; licznik = licznik + 1) {
            wynik = wynik + oceny[licznik];
        }
        this.sredniaOcen = wynik / (float) oceny.length; // = 4
        // 4.0
        return this.sredniaOcen;
    }

    public boolean isZagrozenie() {
        for (int ocena : oceny) {
            // wynik = wynik + ocena;
            if (ocena < 3) {
                return true;
            }
            if (ocena == 1 || ocena == 2) {
                return true;
            }
//            if (ocena == 1) {
//                return true;
//            }
//            if (ocena == 2) {
//                return true;
//            }
            if (ocena == 1 && ocena < 3) {

            } else {
                // jezeli ocena jest rozna od 1 lub ocena jest wieksza lub rowna 3
            }
        }

        return false;
    }
}
