import java.util.Scanner;

public class factors26 {
    public static void main(String[] args) {
        int number;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
        System.out.println("Factors of " + number + " are:");
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
