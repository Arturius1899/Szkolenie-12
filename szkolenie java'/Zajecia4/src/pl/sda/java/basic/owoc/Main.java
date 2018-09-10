package pl.sda.java.basic.owoc;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    /*
    10. Stwórz kolekcję typu HashSet, która przechowuje obiekty typu Owoc
    11. Dodaj wcześniej stworzone owoce do powyższej kolekcji
    12. Wyświetl smak każdego owocu w kolekcji
     */
    public static void main(String[] args) {
//        Owoc jakisOwoc = new Owoc("ZwyklyOwoc"); // Nie można, ponieważ Owoc to klasa abstrakcyjna
        Jablko jakiesJablko = new Jablko();
        Truskawka jakasTruskawka = new Truskawka();
        Wisnia jakasWisnia = new Wisnia();
        Wisnia jakasWisnia2 = new Wisnia();
        Owoc jakisOwoc = new Wisnia();

        System.out.println(jakasWisnia.equals(jakasWisnia2));
        System.out.println(jakasWisnia.equals(jakiesJablko));

        ArrayList<Owoc> listaOwocow = new ArrayList<>();
//        listaOwocow.add(jakisOwoc);
        listaOwocow.add(jakiesJablko);
        listaOwocow.add(jakasTruskawka);
        listaOwocow.add(jakasWisnia);

        for (Owoc tymczasowyOwoc : listaOwocow) {
            System.out.println(tymczasowyOwoc.getNazwa());
            System.out.println(tymczasowyOwoc.kolor());
            System.out.println(tymczasowyOwoc.smak());
            System.out.println(tymczasowyOwoc.wielkosc());
        }
        for (int i = 0; i < listaOwocow.size(); i++) {
            Owoc tymczasowyOwoc = listaOwocow.get(i);
            System.out.println(tymczasowyOwoc.getNazwa());
            System.out.println(tymczasowyOwoc.kolor());
            System.out.println(tymczasowyOwoc.smak());
            System.out.println(tymczasowyOwoc.wielkosc());
        }

        HashSet<Owoc> unikalneOwoce = new HashSet<>();
//        unikalneOwoce.add(jakisOwoc);
        unikalneOwoce.add(jakiesJablko);
        unikalneOwoce.add(jakasTruskawka);
        unikalneOwoce.add(jakasWisnia);
        unikalneOwoce.add(jakiesJablko);
        unikalneOwoce.add(jakasWisnia2);

        System.out.println(unikalneOwoce.size());

        HashSet<String> unikalneLancuchyZnakowe = new HashSet<>();
        unikalneLancuchyZnakowe.add("Michał");
        unikalneLancuchyZnakowe.add("Andrzej");
        unikalneLancuchyZnakowe.add("Janusz");
        unikalneLancuchyZnakowe.add("Grażynka");
        unikalneLancuchyZnakowe.add("Grażynka");
        unikalneLancuchyZnakowe.add("Michał");

        for (String lancuchZnakowy : unikalneLancuchyZnakowe) {
            System.out.println(lancuchZnakowy);
        }
    }
}
