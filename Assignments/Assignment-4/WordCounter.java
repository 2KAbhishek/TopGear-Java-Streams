import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCounter {
    // Count occurrences of "the" in file
    void theCounter(File file) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(file.getPath()))) {
            int count = (int) lines.map(s -> s.split("\\s")).flatMap(Arrays::stream)
                    .filter(line -> line.contains("the")).count();
            System.out.println("Number of \"the\" in file: " + count);
        }
    }
}
