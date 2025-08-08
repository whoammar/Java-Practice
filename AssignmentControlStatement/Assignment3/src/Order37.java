import java.util.Scanner;

public class Order37 {
   private int numberOne;
   private int numberTwo;
   private int numberThree;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(int numberThree) {
        this.numberThree = numberThree;
    }

    public Order37() {
    }

    public Order37(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1st Number: ");
    setNumberOne(scanner.nextInt());
    System.out.println("Enter 2nd Number: ");
    setNumberTwo(scanner.nextInt());
    System.out.println("Enter 3rd Number: ");
    setNumberThree(scanner.nextInt());
    scanner.close();
}
public void display(){
        if (numberOne<numberTwo && numberTwo<numberThree){
            System.out.println("Increasing Order");
        } else if (numberOne>numberTwo && numberTwo>numberThree) {
            System.out.println("Decreasing Order");
        }else {
            System.out.println("Not in any order.");
        }
    }
}

