import java.util.Scanner;

public class Plaindrome21{
    public static void main(String []args ){
        int number;
        int originalNumber;
        int digit;
        int reversed = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
        originalNumber = number;

        while (number>0){
            digit = number%10;
            reversed = reversed * 10 + digit;
            number= number / 10;
        }

        if (originalNumber == reversed){
            System.out.println("Entered Number is a Plaindrome.");
        }else {
            System.out.println("Entered Number is not a plaindrome. ");
        }
    }
}
