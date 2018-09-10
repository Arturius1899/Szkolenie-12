package pl.sda.java.basic.junit;

// Ctrl + Shift + T przenosi nas do (lub tworzy) test(u)
public class Kalkulator {

    public float dodawanie(float a, float b) {
        return a + b;
    }

    public float odejmowanie(float a, float b) {
        return a - b;
    }

    public float mnozenie(float a, float b) {
        return a * b;
    }

    public float dzielenie(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }
}
