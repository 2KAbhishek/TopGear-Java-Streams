import java.io.File;

public class Assignment2 {
    public static void main(String[] args) {
        ReverseReader rev = new ReverseReader();
        rev.readFile(new File("./ReverseDemo.txt"));
    }
}
