import java.util.Scanner;

public class FirstAndLast15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number= scanner.nextInt();

        //First step: Finding the last digit.
        if (number<0){
            number = -number;
        }
        int lastDigit = number%10;
        //Second Step: Finding the Last Digit.
        int firstDigit=number;
        while (firstDigit>=10){
            firstDigit/=10;
        }

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
