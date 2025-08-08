import java.util.Scanner;

public class ArmStrong23 {
    public static void main(String []args){
        int number;
        int length;
        String numberValue;
        int originalNumber;
        int digit;
      double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
       originalNumber = number;
       numberValue =  String.valueOf(number);
        length = numberValue.length();

        while (number>0){
            digit = number%10;
            sum += Math.pow(digit, length);
            number = number/10;
        }
        if (sum==originalNumber){
            System.out.println("Entered Number is a ArmStrong Number");
        }else {
            System.out.println("Entered Number is Not Armstrong");
        }

    }
}
