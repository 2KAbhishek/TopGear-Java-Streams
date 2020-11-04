import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bank {
    List<String> data;
    ArrayList<Customer> customers = new ArrayList<>();

    // Read file and save non empty lines to list
    void readCustomers(File file) {
        try (Stream<String> lines = Files.lines(Paths.get(file.getPath()))) {
            data = lines.map(s -> s.split("\n")).flatMap(Arrays::stream).filter(w -> w.length() > 0)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Generates customers from customerData
    void generateCustomers() {
        int last = 0;
        while (last < data.size()) {

            long id = Long.parseLong(data.get(last));
            String name = data.get(last + 1);
            String loc = data.get(last + 2);
            int age = Integer.parseInt(data.get(last + 3));

            // Create date object from string
            String[] nums = data.get(last + 4).split("-");
            Date date = Date.valueOf(
                    LocalDate.of(Integer.parseInt(nums[2]), Integer.parseInt(nums[1]), Integer.parseInt(nums[0])));

            customers.add(new Customer(id, name, loc, age, date));

            last += 5;
        }

    }

    // Get eligible customers
    void getEligible() {
        System.out.println("Eligible customers:");
        for (Customer c : customers) {
            if (c.getCustomerAge() < 25 && c.getCustomerAddress().equals("Hyderabad")) {
                System.out.println(c);
            }
        }
    }
}
