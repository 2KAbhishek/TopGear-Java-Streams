import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongWords {
    void readWord(File file) {
        try (Stream<String> lines = Files.lines(Paths.get(file.getPath()))) {
            List<String> longWord = lines.map(s -> s.split("\\s")).flatMap(Arrays::stream)
                    .filter(w -> w.matches("\\w+")).collect(Collectors.toList());
            String s = longWord.stream().max(Comparator.comparing(String::length)).get();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
