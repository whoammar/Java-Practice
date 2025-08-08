import java.util.Scanner;

public class Months2 {
    int input;

    public Months2(int input) {
        this.input = input;
    }

    public Months2() {
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month number to check days In it: ");
        setInput(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        switch (input){
            case 1:
            System.out.println("31");
            break;
            case 2:
                System.out.println("28 or 29");
                break;

            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
