import java.util.Scanner;

public class Series12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        long term = 0;
        long sum = 0;

        for (int i = 1; i <= numTerms; i++) {
            term = term * 10 + 9;  // Constructing the term
            sum += term;           // Adding it to the sum
            System.out.println("Term " + i + ": " + term);
        }

        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }
}
