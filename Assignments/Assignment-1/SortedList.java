import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SortedList {
    ArrayList<Path> dirs = new ArrayList<>();
    PathComparator pc = new PathComparator();

    // Create a sorted list of directories
    SortedList(File file) {
        try (Stream<Path> list = Files.list(Paths.get(file.getPath()))) {
            list.filter(Files::isDirectory).forEach(x -> {
                dirs.add(x);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        dirs.sort(pc);
    }

    // List out all directories in dir list
    void list() {
        System.out.println("================================");
        System.out.println("Directory list: ");
        dirs.forEach(dir -> {
            String dirName = dir.toString();
            int lastSep = Math.max(dirName.lastIndexOf("\\"), dirName.lastIndexOf("/"));
            dirName = dirName.substring(lastSep + 1);
            System.out.println(dirName);
        });
        System.out.println("================================");
    }

    // List directories which match certain pattern
    void list(String pat) {
        System.out.println("Directories that match the pattern: ");
        dirs.forEach(dir -> {
            String dirName = dir.toString();
            dirName = dirName.substring(dirName.lastIndexOf('/') + 1);
            if (dirName.matches(pat))
                System.out.println(dirName);
        });
    }
}
