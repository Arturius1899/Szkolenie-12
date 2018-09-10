package pl.sda.java.basic;

public class TablicaLiczbCalkowitych {
//  6. Stwórz klasę, która przechowuje tablicę liczb całkowitych
//  7. Dodaj konstruktor, który jako argument przyjmuje tablicę liczb całkowitych
//  8. Dodaj metodę, która wypiszen a konsolę 2 najmniejsze oraz 2 największe
//    liczby z podanej tablicy
    private int[] liczby;

    public TablicaLiczbCalkowitych(int[] liczbyPodanePrzyTworzeniu) {
        this.liczby = liczbyPodanePrzyTworzeniu;
    }

    public void wypisz2nawiekszeINajmniejsze() {
        int najmniejsza = liczby[0];
        int najmniejsza2 = liczby[0];
        int najwieksza = liczby[0];
        int najwieksza2 = liczby[0];
        for (int licznik = 1; licznik < liczby.length; licznik++) {
            if (najmniejsza > liczby[licznik]) {
                najmniejsza2 = najmniejsza;
                najmniejsza = liczby[licznik];
            } else if (najmniejsza2 > liczby[licznik]) {
                najmniejsza2 = liczby[licznik];
            }
            if (najwieksza < liczby[licznik]) {
                najwieksza2 = najwieksza;
                najwieksza = liczby[licznik];
            } else if (najwieksza2 < liczby[licznik]) {
                najwieksza2 = liczby[licznik];
            }
        } // 20, 150, 1410, 13, 999, 532

        System.out.println("Najmniejsza liczba to " + najmniejsza);
        System.out.println("Druga najmniejsza liczba to " + najmniejsza2);
        System.out.println("Najwieksza liczba to " + najwieksza);
        System.out.println("Druga najwieksza liczba to " + najwieksza2);
    }
}
