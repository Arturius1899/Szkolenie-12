package pl.sda.java.basic.abstracting;

/**
 * @author Michal Jaszczyk
 **/
public class KlasaDziedziczacaPoAbstrakcyjnej extends KlasaAbstrakcyjna {
    @Override
    protected void jakasMetoda() {
        // trzeba zaimplenetować tą metodę, mimo że została ona zaimplementowana w zwyklej klasie,
        // ale w klasie abstrakcyjnej już nie posiada implementacji
    }
}
