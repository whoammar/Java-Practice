import java.util.Scanner;

public class ArmStrong36 {
    public static void main(String[] args) {
    int number;
        int armStrong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        int originalNumber = number;
        int length=String.valueOf(number).length();
        for (int i = 0; i < length; i++) {
           int digit =  number%10;
           armStrong += (int)  Math.pow(digit,length);
           number/=10;
        }
        if (originalNumber == armStrong) {
            System.out.println("Entered Number is an Armstrong Number");
        }else {
            System.out.println("Entered Number is Not armStrong.");
        }
        }
    }

