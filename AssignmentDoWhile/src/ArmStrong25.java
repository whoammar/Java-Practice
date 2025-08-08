import com.sun.jdi.Value;

import java.util.Scanner;

public class ArmStrong25 {
    public static void main(String[] args) {
    int number;
    int digit;
    int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        int originalNumber = number;

         String str = String.valueOf(number);
         int length = str.length();
        do {
            digit=number%10;
          sum += (int)  Math.pow(digit,length);
           number/=10;
        }while (number>0);

        if (sum==originalNumber){
            System.out.println("Entered Number is an ArmStrong Number.");
        }else {
            System.out.println("Entered Number is not ArmStrong Number. ");
        }
    }
}
