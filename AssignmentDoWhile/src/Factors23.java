import java.util.Scanner;

public class Factors23 {
    public static void main(String[] args) {
        int number;
        int i = 1; // Start from 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();

        System.out.println("Factors of " + number + " are: ");

        // Use do-while loop to find all factors
        do {
            if (number % i == 0) {
                System.out.println(i);  // Print the factor
            }
            i++;  // Increment i
        } while (i <= number);  // Continue until i <= number
    }
}
