package pl.sda.java.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Michal Jaszczyk
 **/
public class FileConverter {

    private List<FileParser> fileParsers = new ArrayList<>();

    public void addParser(FileParser fileParser) {
        fileParsers.add(fileParser);
    }

    public void displayConvertedFiles() {
        try (Stream<Path> paths = Files.list(new File("src/main/resources/testFiles").toPath())) {
            List<Path> filePaths = paths.collect(Collectors.toList());
            for (Path filePath : filePaths) {
                List<String> fileContent = Files.readAllLines(filePath);
                for (FileParser fileParser : fileParsers) {
                    if (fileParser.validFormat(filePath.getFileName().toString())) {
                        System.out.println("Original content: " + fileContent);
                        System.out.println("Parser: " + fileParser.name() + " Content: " + fileParser.parse(fileContent));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Nieoczekiwany błąd " + e.getMessage());
            e.printStackTrace();
        }
    }
}
