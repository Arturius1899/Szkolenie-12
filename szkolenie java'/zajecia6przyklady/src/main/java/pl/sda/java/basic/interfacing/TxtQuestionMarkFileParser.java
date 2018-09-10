package pl.sda.java.basic.interfacing;

import java.util.ArrayList;
import java.util.List;

public class TxtQuestionMarkFileParser extends TxtFileParser { // rozszerzamy klasę TxtFileParser, która implementuje FileParser
    @Override
    public String name() {
        return "TxtQuestionMarkFileParser";
    }

    // nie musimy implementować metody validFormat, ponieważ jest już ona zaimplementowana w klasie TxtFileParser

    // przeciążamy metodę parse, abyw inny sposób zamieniać spacje
    @Override
    public List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            String parsedLine = line.replaceAll(" ", "?"); // zamiana spacji na znaki zapytania
            result.add(parsedLine);
        }

        return result;
    }
}
