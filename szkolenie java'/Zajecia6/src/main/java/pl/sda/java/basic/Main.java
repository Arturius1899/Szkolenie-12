package pl.sda.java.basic;

/**
 * @author Michal Jaszczyk
 **/
public class Main {
    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();
        fileConverter.addParser(new TxtFileParser());
        fileConverter.displayConvertedFiles();
    }
}
