import java.io.File;
import java.io.IOException;

public class Assignment4 {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        try {
            wc.theCounter(new File("./TheFIle.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
