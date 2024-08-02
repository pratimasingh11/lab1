package lab1;

public class Pizza {
    private String customerName;
    private String size;
    private String toppings;

    public Pizza(String customerName, String size, String toppings) {
        this.customerName = customerName;
        this.size = size;
        this.toppings = toppings;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Size: " + size + ", Toppings: " + toppings;
    }
}
