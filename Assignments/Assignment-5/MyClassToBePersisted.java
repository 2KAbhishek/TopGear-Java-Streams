import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyClassToBePersisted {
    public static void main(String[] args) {
        Profile pr1 = new Profile();
        School sc1 = new School();
        pr1.setName("Abhishek");
        pr1.setAge(10);
        pr1.setHobby("Video Games");
        sc1.setNameOfSchool("Kid Zone");
        sc1.setYearStarted(1998);
        pr1.setSchool(sc1);

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
