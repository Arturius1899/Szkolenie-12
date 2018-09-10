package pl.sda.java.basic.statki;

/**
 * @author Michal Jaszczyk
 **/
public class Statki {

    private static final int PUNKTY_ZA_TRAFIENIE = 100;

    private Plansza plansza1;
    private Plansza plansza2;
    private int punktacjaGracza1 = 0;
    private int punktacjaGracza2 = 0;

    public Statki(int szerokoscPlanszy, int wysokoscPlanszy) {
        plansza1 = new Plansza(wysokoscPlanszy, szerokoscPlanszy);
        plansza2 = new Plansza(wysokoscPlanszy, szerokoscPlanszy);
    }

    public boolean gracz1DodajStatek(Wspolrzedne poczatek, Wspolrzedne koniec) {
        return plansza1.dodajStatek(poczatek, koniec);
    }

    public boolean gracz2DodajStatek(Wspolrzedne poczatek, Wspolrzedne koniec) {
        return plansza2.dodajStatek(poczatek, koniec);
    }

    public boolean gracz1Strzelaj(Wspolrzedne strzal) {
        boolean trafiony = plansza2.strzelaj(strzal);
        if (trafiony) {
//            punktacjaGracza1 += PUNKTY_ZA_TRAFIENIE;
            punktacjaGracza1 = punktacjaGracza1 + PUNKTY_ZA_TRAFIENIE;
        }
        return trafiony;
    }

    public boolean gracz2Strzelaj(Wspolrzedne strzal) {
        boolean trafiony = plansza1.strzelaj(strzal);
        if (trafiony) {
            punktacjaGracza2 += PUNKTY_ZA_TRAFIENIE;
        }
        return trafiony;
    }

    public boolean koniecGry() {
        return plansza1.koniecGry() || plansza2.koniecGry();
    }

    public int gracz1Punktacja() {
        return punktacjaGracza1;
    }

    public int gracz2Punktacja() {
        return punktacjaGracza2;
    }
}
