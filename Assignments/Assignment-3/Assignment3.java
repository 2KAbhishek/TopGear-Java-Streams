import java.io.File;

public class Assignment3 {
    public static void main(String[] args) {
        LongWords lw = new LongWords();
        System.out.println("Longest word in file:");
        lw.readWord(new File("./LongestWords.txt"));
    }
}
