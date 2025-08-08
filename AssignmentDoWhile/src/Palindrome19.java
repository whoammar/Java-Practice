import java.util.Scanner;

public class Palindrome19 {
    public static void main(String[] args) {
     int number;
     int reversed =0;
     int digit;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=scanner.nextInt();
        if (number<0){
            number=-number;
        }
        int originalNumber = number;
        //Finding Reverse of the Number
        do {
            digit=number%10;
            reversed = reversed*10+digit;
          number/=10;
        }while (number>0);
        if (originalNumber==reversed ){
            System.out.println("Entered Number is palindrome.");
        }else {
            System.out.println("Entered Number is Not palindrome.");
        }
    }
}
