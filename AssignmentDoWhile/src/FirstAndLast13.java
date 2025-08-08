import java.util.Scanner;

public class FirstAndLast13 {
    public static void main(String[] args) {
        int number;
        int lastDigit;
        int firstDigit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }
        lastDigit = number % 10;

        if (number < 10) {
            firstDigit = number;
        } else {
            firstDigit = number;
            do {
                firstDigit /= 10;
            } while (firstDigit >= 10);
        }

        System.out.println("First Digit: " + firstDigit);
        System.out.println("Last Digit: " + lastDigit);
    }
}
