import java.util.Scanner;

public class Maximum16 {
    public int getInputOne() {
        return inputOne;
    }

    public void setInputOne(int inputOne) {
        this.inputOne = inputOne;
    }

    public int getInputTwo() {
        return inputTwo;
    }

    public void setInputTwo(int inputTwo) {
        this.inputTwo = inputTwo;
    }

    public int getInputThree() {
        return inputThree;
    }

    public void setInputThree(int inputThree) {
        this.inputThree = inputThree;
    }

    int inputOne;
    int inputTwo;
    int inputThree;

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    int choice;

    public Maximum16() {
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        setInputOne(scanner.nextInt());
        System.out.println("Enter 2nd Number: ");
        setInputTwo(scanner.nextInt());
        System.out.println("Enter 3rd Number: ");
        setInputThree(scanner.nextInt());
        System.out.println("Press 1 to find Maximum,Press 2 to find Minimum..");
        setChoice(scanner.nextInt());

        scanner.close();
    }
    public void display() {
        switch (choice) {
            case 1:
                System.out.println( "Maximum value is: "+ Math.max(Math.max(inputOne, inputTwo), inputThree));
                break;
            case 2:
                System.out.println("Minimum value is: "+ Math.min(Math.min(inputThree,inputTwo),inputOne));
                break;
        }

    }
}