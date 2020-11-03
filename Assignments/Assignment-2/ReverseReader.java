import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ReverseReader {

    // Read lines from file to a list, print the lines upper cased and in reverse
    void readFile(File file) {
        try (BufferedReader bufLines = Files.newBufferedReader(Paths.get(file.getPath()))) {
            LinkedList<String> listOfString = bufLines.lines().collect(Collectors.toCollection(LinkedList::new));
            listOfString.descendingIterator().forEachRemaining(str -> System.out.println(str.toUpperCase()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
