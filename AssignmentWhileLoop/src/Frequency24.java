import java.util.Scanner;

public class Frequency24 {
    public static void main(String[] args) {
        int nine = 0, eight = 0, seven = 0, six = 0, five = 0;
        int four = 0, three = 0, two = 0, one = 0, zero = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;

            switch (digit) {
                case 9: nine++; break;
                case 8: eight++; break;
                case 7: seven++; break;
                case 6: six++; break;
                case 5: five++; break;
                case 4: four++; break;
                case 3: three++; break;
                case 2: two++; break;
                case 1: one++; break;
                case 0: zero++; break;
            }

            number /= 10;
        }

        // Print the frequency of each digit
        System.out.println("Digit 9: " + nine + " times");
        System.out.println("Digit 8: " + eight + " times");
        System.out.println("Digit 7: " + seven + " times");
        System.out.println("Digit 6: " + six + " times");
        System.out.println("Digit 5: " + five + " times");
        System.out.println("Digit 4: " + four + " times");
        System.out.println("Digit 3: " + three + " times");
        System.out.println("Digit 2: " + two + " times");
        System.out.println("Digit 1: " + one + " times");
        System.out.println("Digit 0: " + zero + " times");
    }
}
