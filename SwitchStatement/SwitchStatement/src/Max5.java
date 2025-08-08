import java.util.Scanner;

public class Max5 {
    int ValueOne;
    int ValueTwo;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    int choice;


    public int getValueOne() {
        return ValueOne;
    }

    public void setValueOne(int valueOne) {
        ValueOne = valueOne;
    }

    public int getValueTwo() {
        return ValueTwo;
    }

    public void setValueTwo(int valueTwo) {
        ValueTwo = valueTwo;
    }

    public Max5(int valueOne, int valueTwo) {
        ValueOne = valueOne;
        ValueTwo = valueTwo;
    }

    public Max5() {
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        setValueOne(scanner.nextInt());
        System.out.println("Enter 2nd Number: ");
        setValueTwo(scanner.nextInt());
        System.out.println("Choose an option: 1 for max, 2 for min");
        setChoice(scanner.nextInt());
        scanner.close();
    }

    public void display() {
        switch (choice) {
            case 1:
                System.out.println("Maximum value: " + Math.max(getValueOne(), getValueTwo()));
                break;
            case 2:
                System.out.println("Minimum value: " + Math.min(getValueOne(), getValueTwo()));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}

