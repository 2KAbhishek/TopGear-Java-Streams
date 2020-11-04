import java.io.File;

public class Assignment6 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.readCustomers(new File("./Customers.txt"));
        bank.generateCustomers();
        bank.getEligible();
    }
}
