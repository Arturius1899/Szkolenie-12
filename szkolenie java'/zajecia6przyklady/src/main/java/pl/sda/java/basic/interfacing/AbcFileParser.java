package pl.sda.java.basic.interfacing;

import java.util.ArrayList;
import java.util.List;

public class AbcFileParser implements FileParser {
    @Override
    public String name() {
        return "AbcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.toLowerCase().endsWith(".abc"); // litery w nazwie pliku zamieniamy na małe,
                                                    // a później sprawdzamy czy kończy się on ciągiem znaków ".abc"
    }

    @Override
    public List<String> parse(List<String> fileContent) { // przeciążenie domyślnej implementacji z interfejsu
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            String parsedLine = line.replace("abc", " "); // w każdym ciągu znaków z listy zamieniamy wszystkie wyrażenia "abc" na spacje
            result.add(parsedLine); // dodajemy wynik powyższej zamiany do listy z wynikami
        }
        return result; // zwrcamy listę z wynikami
    }
}
