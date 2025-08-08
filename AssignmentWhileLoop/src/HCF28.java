
import java.util.Scanner;

public class HCF28 {

    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Output the HCF
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + findGCD(num1,num2));

        // Close the scanner
        scanner.close();
    }
}
