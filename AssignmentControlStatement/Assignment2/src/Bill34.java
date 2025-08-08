import java.util.Scanner;

public class Bill34 {
    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    double totalBill;
    double unitsConsumed;

    public Bill34() {
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Units Consumed: ");
        setUnitsConsumed(scanner.nextDouble());
        scanner.close();
    }
    public void displayBills(){
    if (unitsConsumed<=50){
        totalBill = unitsConsumed*0.50;
    } else if (unitsConsumed<=150) {
        totalBill = unitsConsumed*0.75;
    } else if (unitsConsumed<=250) {
        totalBill = unitsConsumed*1.20;
    }else {
        totalBill = unitsConsumed*1.50;
    }

        // Adding surcharge (20%)
        totalBill += totalBill * 0.20;
        System.out.println("Total Bill: "+ totalBill);

    }


}
