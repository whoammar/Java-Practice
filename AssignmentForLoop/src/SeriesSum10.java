import java.util.Scanner;

public class SeriesSum10 {

    // Method to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to calculate the sum of the series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input value for X
        System.out.print("Enter the value of X: ");
        double X = sc.nextDouble();

        // Input number of terms
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        double sum = 1; // First term is 1
        int sign = -1; // To alternate signs

        // Loop to calculate the series
        for (int i = 1; i < terms; i++) {
            int power = 2 * i;
            double term = Math.pow(X, power) / factorial(power);
            sum += sign * term; // Alternating sign
            sign *= -1; // Switch sign for the next term
        }

        System.out.println("Sum of the series: " + sum);
    }
}
