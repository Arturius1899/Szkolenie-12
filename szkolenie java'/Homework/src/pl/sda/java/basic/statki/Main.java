package pl.sda.java.basic.statki;


import java.util.Random;

/**
 * @author Michal Jaszczyk
 **/
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int szerokoscPlanszy = 10;
        int wysokoscPlanszy = 20;
        Statki statki = new Statki(szerokoscPlanszy, wysokoscPlanszy);

        statki.gracz1DodajStatek(new Wspolrzedne(0, 0), new Wspolrzedne(0, 3));
        statki.gracz1DodajStatek(new Wspolrzedne(9, 15), new Wspolrzedne(9, 19));
        statki.gracz1DodajStatek(new Wspolrzedne(3, 4), new Wspolrzedne(6, 4));
        statki.gracz1DodajStatek(new Wspolrzedne(5, 10), new Wspolrzedne(9, 10));

        statki.gracz2DodajStatek(new Wspolrzedne(0, 0), new Wspolrzedne(0, 3));
        statki.gracz2DodajStatek(new Wspolrzedne(9, 15), new Wspolrzedne(9, 19));
        statki.gracz2DodajStatek(new Wspolrzedne(3, 4), new Wspolrzedne(6, 4));
        statki.gracz2DodajStatek(new Wspolrzedne(5, 10), new Wspolrzedne(9, 10));

        while (!statki.koniecGry()) {
            Wspolrzedne gracz1Strzal = losowyStrzal(random, szerokoscPlanszy, wysokoscPlanszy);
            boolean trafiony = statki.gracz1Strzelaj(gracz1Strzal);
            if (trafiony) {
                System.out.println("Trafiony! Punkty gracza 1: " + statki.gracz1Punktacja());
            }

            Wspolrzedne gracz2Strzal = losowyStrzal(random, szerokoscPlanszy, wysokoscPlanszy);
            trafiony = statki.gracz2Strzelaj(gracz2Strzal);
            if (trafiony) {
                System.out.println("Trafiony! Punkty gracza 2: " + statki.gracz2Punktacja());
            }
        }
    }

    private static Wspolrzedne losowyStrzal(Random random, int szerokoscPlanszy, int wysokoscPlanszy) {
        return new Wspolrzedne(random.nextInt(szerokoscPlanszy), random.nextInt(wysokoscPlanszy));
    }
}
