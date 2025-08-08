import java.util.Scanner;

public class Voting18 {
    int age;

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        age = scanner.nextInt();

    }
    public void display(){
        switch (age>= 18 ? 1: 0){
            case 1:
                System.out.println("You are Eligible for Voting. ");
                break;
            case 0:
                System.out.println("You are Not Eligible for Voting.");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
