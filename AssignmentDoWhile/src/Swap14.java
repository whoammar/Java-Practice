import java.util.Scanner;

public class Swap14 {
    public static void main(String[] args) {
        int number;
        int lastDigit;
        int firstDigit;
        int originalNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
        if (number<0){
            number=-number;
        }
        originalNumber=number;

        //Finding last Digit
            lastDigit=number%10;
        //finding First Digit
        firstDigit=number;
        if (firstDigit<10){
            firstDigit=number;
        }else {
            do {
                firstDigit/=10;
            }while (firstDigit>=10);

        }
        //length of Number
        String str =String.valueOf(originalNumber);
        int length=str.length();


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
