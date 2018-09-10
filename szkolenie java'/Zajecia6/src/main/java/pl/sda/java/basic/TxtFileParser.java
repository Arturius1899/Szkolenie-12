package pl.sda.java.basic;

/**
 * @author Michal Jaszczyk
 **/
public class TxtFileParser implements FileParser {
    @Override
    public String name() {
        return "TxtFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".txt");
    }
}
