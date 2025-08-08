import java.util.Scanner;

public class Bill28 {
    private double unitsConsumed;
    private int customerId;
    private String name;
    private double bill;
    private double billAfterTax;

    // Getters and Setters
    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBillAfterTax() {
        return billAfterTax;
    }

    public void setBillAfterTax(double billAfterTax) {
        this.billAfterTax = billAfterTax;
    }

    // Constructor
    public Bill28() {}

    // Method to take input
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        setName(scanner.nextLine());
        System.out.println("Enter customer ID:");
        setCustomerId(scanner.nextInt());
        System.out.println("Enter Units Consumed: ");
        setUnitsConsumed(scanner.nextDouble());
        scanner.close();
    }

    public void calculateBillAmount() {
        if (getUnitsConsumed() <= 199) {
            setBill(getUnitsConsumed() * 1.20);
        } else if (getUnitsConsumed() >= 200 && getUnitsConsumed() <= 400) {
            setBill(getUnitsConsumed() * 1.50);
        } else if (getUnitsConsumed() > 400 && getUnitsConsumed() <= 600) {
            setBill(getUnitsConsumed() * 1.80);
        } else {
            setBill(getUnitsConsumed() * 2.00);
        }
    }

    public void applyTaxes() {
        if (getBill() >= 400) {
            setBillAfterTax(getBill() * 1.15);  // Applying tax
        } else {
            setBillAfterTax(getBill());  // No tax if bill is less than 400
        }
    }

    public void display() {
        System.out.println("Consumer Name: " + getName());
        System.out.println("Consumer ID: " + getCustomerId());
        System.out.println("Bill before tax: " + getBill());
        System.out.println("Final Bill (after tax if applicable): " + getBillAfterTax());
    }


}
