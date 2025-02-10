public class P17_Constructor {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public P17_Constructor() {
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public P17_Constructor(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    // Setter methods
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String toString() {
        return "Customer Name: " + customerName + ", Customer ID: " + customerId + ", Customer City: " + customerCity;
    }

    public static void main(String[] args) {
        P18_Encapsulation.main(args);
    }
}
