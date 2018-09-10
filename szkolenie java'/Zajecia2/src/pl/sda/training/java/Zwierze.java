package pl.sda.training.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zwierze {

    private String gatunek;

    public Zwierze(String gatunek) {
        if (gatunek.equals("gad")
                || gatunek.equals("płaz")
                || gatunek.equals("ssak")
                || gatunek.equals("ryba")
                || gatunek.equals("ptak")) {
            this.gatunek = gatunek;
        } else {
            this.gatunek = "nieznany";
        }
    }

//    private List<String> poprawneGatunki = Arrays.asList("płaz", "ssak", "ryba", "ptak", "gad");
//    public Zwierze(String gatunek) {
//        if (poprawneGatunki.contains(gatunek)) {
//            this.gatunek = gatunek;
//        } else {
//            this.gatunek = "nieznany";
//        }
//    }
}
