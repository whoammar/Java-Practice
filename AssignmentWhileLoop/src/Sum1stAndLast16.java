import java.util.Scanner;

public class Sum1stAndLast16 {
    public static void main(String[] args) {
        int number;
        int firstDigit;
        int lastDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        //last Digit
        lastDigit = number % 10;
        //first digit
        while (number>=10){
            number/=10;
        }
        firstDigit = number;

        System.out.println("Sum of first and last Digit is: " + (firstDigit + lastDigit));
    }
    }