package pl.sda.java.basic.solution.homework3.temperature;

/**
 * @author Michal Jaszczyk
 **/
public class KonwerterTemperatury {

    private float stopnieCelsjusza;

    public KonwerterTemperatury(float stopnieCelsjusza) {
        this.stopnieCelsjusza = stopnieCelsjusza;
    }

    public float zwrocWKelvinach() {
        return stopnieCelsjusza + 273.15f;
    }

    public float zwrocWFahrenheit() {
        return (stopnieCelsjusza * 1.8f) + 32;
    }
}
