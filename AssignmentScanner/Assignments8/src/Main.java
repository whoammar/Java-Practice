import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Your age in seconds is: " + age *365*24*60*60 );

    }
}