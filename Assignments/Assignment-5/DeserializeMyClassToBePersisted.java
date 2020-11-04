import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMyClassToBePersisted {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Profile.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Profile pr1 = (Profile) ois.readObject();

            System.out.println("Read Profile details from file:");
            System.out.println(pr1);
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
