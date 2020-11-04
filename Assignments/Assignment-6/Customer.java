import java.sql.Date;

public class Customer {
    private long customerID;
    private String customerName;
    private String customerAddress;
    private int customerAge;
    private Date customerDate;

    public Customer(long customerID, String customerName, String customerAddress, int customerAge, Date customerDate) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
        this.customerDate = customerDate;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public Date getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(Date customerDate) {
        this.customerDate = customerDate;
    }

    @Override
    public String toString() {
        return "Customer [customerAddress=" + customerAddress + ", customerAge=" + customerAge + ", customerDate="
                + customerDate + ", customerID=" + customerID + ", customerName=" + customerName + "]";
    }

}
