import java.util.Scanner;

public class Discount {
    double totalBill;
    double discountedPrice;
    public static final int DISCOUNT_PRICE = 1000;

    //default Constructor
    public Discount() {
    }

//getter setter


    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total Bill: ");
        setTotalBill(scanner.nextInt());
        scanner.close();
    }

    public void display(){
       if(getTotalBill()>DISCOUNT_PRICE){
           System.out.println(" Price after Discount is :  " +( discountedPrice = getTotalBill() - (getTotalBill()* 0.10)));

       }else {
           System.out.println("Your bill  is : "+getTotalBill());
       }
    }
}
