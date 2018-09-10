package pl.sda.java.basic.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KalkulatorTest {

    private Kalkulator kalkulator = new Kalkulator();

    @Test
    public void powinienZwrocicPoprawnyWynikDodawania() {
        // given // przygotowanie danych do testowania
        float a = 1;
        float b = 3;
        // when
        float wynik = kalkulator.dodawanie(a, b); // to co testujemy
        // then
        assertEquals(4, wynik, 0); // sprawdzenie czy wynik jest poprawny
    }

    @Test
    public void powinienPoprawniePodzielicLiczbyDodatnie() {
        // given
        float a = 3;
        float b = 1;
        // when
        float wynik = kalkulator.dzielenie(a, b);
        // then
        assertEquals(3, wynik, 0);
    }

    @Test
    public void powinienDacWynikZeroPrzyDzieleniuPrzezZero() {
        // given
        float a = 3;
        float b = 0;
        // when
        float wynik = kalkulator.dzielenie(a, b);
        // then
        assertEquals(0, wynik, 0);
    }

    @Test
    public void testWykorzystujacyMetodePomocnicza() {
        pomocniczneDodawanie(1, 3);
    }

    private int pomocniczneDodawanie(int a, int b) {
        return a + b;
    }
}