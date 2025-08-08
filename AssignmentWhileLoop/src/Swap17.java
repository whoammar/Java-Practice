import java.util.Scanner;

public class Swap17 {
    public static void main (String []args){
        int number;
        int firstDigit;
        int lastDigit;
        //Taking input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        //Convert Number if negative
        number = Math.abs(scanner.nextInt());
        //Finding the last Digit
        lastDigit = number%10;
        // Finding the First Digit
        int temp = number;
        while (temp >=10){
            temp /= 10 ;
        }
        firstDigit = temp;

        //Finding length of Number
        String strInput = String.valueOf(number);
       int length=  strInput.length();

// Remove first and last digits to get the middle part
        int middlePart = number % (int) Math.pow(10, length - 1); // Remove first digit
        middlePart = middlePart / 10; // Remove last digit


        //Final touch
        int swappedNumber = (lastDigit * (int) Math.pow(10, length - 1))
                + (middlePart * 10)
                + firstDigit;
        System.out.println(swappedNumber +  " Is the Swapped number of "  + number);
    }
}
