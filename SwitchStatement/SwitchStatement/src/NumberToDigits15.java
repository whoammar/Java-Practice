import java.util.Scanner;

public class NumberToDigits15 {
    int input;

    public NumberToDigits15() {
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        setInput(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        switch (getInput()) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("Thirteen");
                break;
            case 14:
                System.out.println("Fourteen");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 16:
                System.out.println("Sixteen");
                break;
            case 17:
                System.out.println("Seventeen");
                break;
            case 18:
                System.out.println("Eighteen");
                break;
            case 19:
                System.out.println("Nineteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;

            default:
                System.out.println("Invalid Input.");
        }


    }
}




