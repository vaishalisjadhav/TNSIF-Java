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

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer City: " + customerCity);
    }

    public static void main(String[] args) {
        // Using default constructor
        P17_Constructor customer1 = new P17_Constructor();
        customer1.setCustomerName("Vaishali");
        customer1.setCustomerId(101);
        customer1.setCustomerCity("Solapur");
        customer1.displayCustomerInfo();

        System.out.println();

        // Using parameterized constructor
        P17_Constructor customer2 = new P17_Constructor("Sneha", 102, "Pune");
        customer2.displayCustomerInfo();
    }
}
