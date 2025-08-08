import java.util.Scanner;

public class Power33 {
    public static void main(String[] args) {
        int base;
        int exponent;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        // Input for base number
        System.out.println("Enter Base Number: ");
        base = scanner.nextInt();

        // Input for power/exponent
        System.out.println("Enter Power: ");
        exponent = scanner.nextInt();

        // Loop to calculate base^exponent
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
