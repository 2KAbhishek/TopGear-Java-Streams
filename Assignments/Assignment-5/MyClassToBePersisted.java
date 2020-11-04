import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Write serialized data to file
public class MyClassToBePersisted {
    public static void main(String[] args) {
        School sc1 = new School("Kid Zone", 1998);
        Profile pr1 = new Profile("Abhishek", 10, "Video Games", sc1);

        try {
            FileOutputStream fos = new FileOutputStream("./Profile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pr1);
            System.out.println("Profile written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
