package pl.sda.java.basic.interfacing;

public class ZxcFileParser implements FileParser {
    @Override
    public String name() {
        return "ZxcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.toUpperCase().endsWith(".ZXC"); // Sprawdzenie czy podany ciąg znaków (w domyśle nazwa pliku)
                                        // kończy się podanym ciągiem znaków (w tym wypadku ".zxc").
                                        // Jeżeli tak to zsotanie zwrócone true, a jeżeli nie to false
    }
}
