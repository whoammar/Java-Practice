import java.util.Scanner;

public class Strong24 {
    public static void main(String[] args) {
     int number;
     int digit;
     int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        int originalNumber = number;
        do {
            digit=number%10;
             sum += factorial(digit);
            number /= 10;
        }while (number>0);
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }

    public static int factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;

    }
}
