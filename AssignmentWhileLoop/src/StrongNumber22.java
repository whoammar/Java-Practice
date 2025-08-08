import java.util.Scanner;

public class StrongNumber22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
    public static int factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
