import java.util.Scanner;

public class Revenue35 {
    double productPrice;
    double productQuantity;

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    double revenue;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNetRevenue() {
        return netRevenue;
    }

    public void setNetRevenue(double netRevenue) {
        this.netRevenue = netRevenue;
    }

    double discount;
    double netRevenue;


    public Revenue35(double productPrice, double productQuantity) {
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Revenue35() {
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Price: ");
        setProductPrice(scanner.nextDouble());
        System.out.println("Enter Quantity: ");
        setProductQuantity(scanner.nextDouble());
        scanner.close();
        revenue = getProductPrice()* getProductQuantity();
    }
    public void display(){
        System.out.println( "Total Revenue: " + revenue);
        if (revenue>=5000){
           discount = revenue* 0.1;
           System.out.println("Total Discount : " +discount );
           netRevenue = revenue-discount;
            System.out.println("Net revenue is : "+ netRevenue);
        }
    }



}
