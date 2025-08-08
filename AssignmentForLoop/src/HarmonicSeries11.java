import java.util.Scanner;

public class HarmonicSeries11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();

        double sum = 0.0;

        System.out.print("Harmonic series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            sum += 1.0 / i;
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println("\nSum of harmonic series up to " + n + " terms: " + sum);

        input.close();
    }
}
