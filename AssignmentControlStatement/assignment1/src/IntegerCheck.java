import java.util.Scanner;

public class IntegerCheck {
    int integerOne;
    int integerTwo;

    public int getIntegerOne() {
        return integerOne;
    }

    public void setIntegerOne(int integerOne) {
        this.integerOne = integerOne;
    }

    public int getIntegerTwo() {
        return integerTwo;
    }

    public void setIntegerTwo(int integerTwo) {
        this.integerTwo = integerTwo;
    }

    //Default Constructor
    public IntegerCheck() {
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter 1st Integer For comparison");
        setIntegerOne(scanner.nextInt());
        System.out.println("Please Enter 2nd Integer For comparison");
        setIntegerTwo(scanner.nextInt());
    }

    public void display(){
        if (getIntegerOne()>getIntegerTwo()){
            System.out.println(getIntegerOne() + " is Greater than "+ getIntegerTwo());
        }
        else {
            System.out.println(getIntegerTwo()+" is grater than " + getIntegerOne());
        }

    }

}
