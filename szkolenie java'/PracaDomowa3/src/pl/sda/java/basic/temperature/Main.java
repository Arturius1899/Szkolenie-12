package pl.sda.java.basic.solution.homework3.temperature;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        KonwerterTemperatury konwerterTemperatury = new KonwerterTemperatury(36.6f);

        System.out.println(konwerterTemperatury.zwrocWKelvinach());
        System.out.println(konwerterTemperatury.zwrocWFahrenheit());
    }
}
