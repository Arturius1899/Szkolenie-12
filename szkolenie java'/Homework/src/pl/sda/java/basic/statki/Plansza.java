package pl.sda.java.basic.statki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public class Plansza {

    private static final int STATEK = 1;
    private static final int BRAK_STATKU = 0;
    private int wysokosc;
    private int szerokosc;
    private int[][] plansza;
    private int liczbaStatkow = 0;

    public Plansza(int wysokosc, int szerokosc) {
        this.plansza = new int[szerokosc][wysokosc];
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }

    public boolean dodajStatek(Wspolrzedne poczatek, Wspolrzedne koniec) {
        if (saWLiniiProstej(poczatek, koniec) && saNaPlanszy(poczatek, koniec)) {
            ArrayList<Wspolrzedne> statkiDoDodania = new ArrayList<>();
            for (int x = poczatek.getX(); x <= koniec.getX(); x++) {
                for (int y = poczatek.getY(); y <= koniec.getY(); y++) {
                    if(plansza[x][y] != BRAK_STATKU) {
                        return false;
                    }
                    statkiDoDodania.add(new Wspolrzedne(x, y));
                }
            }
            for (Wspolrzedne statek : statkiDoDodania) {
                plansza[statek.getX()][statek.getY()] = STATEK;
                liczbaStatkow++;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean saNaPlanszy(Wspolrzedne poczatek, Wspolrzedne koniec) {
        return poczatek.jestWZakresieOdZeraDo(szerokosc, wysokosc) && koniec.jestWZakresieOdZeraDo(szerokosc, wysokosc);
    }

    private boolean saWLiniiProstej(Wspolrzedne poczatek, Wspolrzedne koniec) {
        return poczatek.getX() == koniec.getX() || poczatek.getY() == koniec.getY();
    }

    public boolean strzelaj(Wspolrzedne strzal) {
        if (plansza[strzal.getX()][strzal.getY()] == STATEK) {
            plansza[strzal.getX()][strzal.getY()] = BRAK_STATKU;
            liczbaStatkow--;
            return true;
        } else {
            return false;
        }
    }

    public boolean koniecGry() {
        return liczbaStatkow == 0;
    }
}
