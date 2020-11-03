import java.io.File;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path (Shows contents of parent dir of this repo by default): ");
        String path = sc.nextLine();
        SortedList dirList;
        if (new File(path).exists()) {
            dirList = new SortedList(new File(path));
        } else {
            dirList = new SortedList(new File("../../../"));
        }
        System.out.print("Enter search pattern: ");
        String pat = sc.nextLine();
        sc.close();
        dirList.list();
        dirList.list("(.*)" + pat + "(.*)");
    }
}
