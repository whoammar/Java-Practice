import java.util.Scanner;

public class Value13 {
    int valueOne;
    int valueTwo;


    //Default Constructor

    public Value13() {
    }


    //Getter Setter
    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;

    }


    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        setValueOne(scanner.nextInt());
        System.out.println(" Enter Second Value : ");
        setValueTwo(scanner.nextInt());
        scanner.close();
    }
public void display(){
    System.out.println( "OUTPUT 1:  "+ Math.abs(valueOne));
    System.out.println( "OUTPUT 2:  " + Math.abs(valueTwo));
}

}
