package pl.sda.java.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michal Jaszczyk
 **/
public interface FileParser {

    String name();

    boolean validFormat(String filename);

    default List<String> parse(List<String> fileContent) {
        List<String> result = new ArrayList<>();
        for (String line : fileContent) {
            result.add(line.replaceAll("\\s", "_"));
        }

        return result;
    }
}
