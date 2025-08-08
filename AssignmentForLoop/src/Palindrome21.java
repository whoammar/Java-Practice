import java.util.Scanner;

public class Palindrome21 {
    public static void main(String[] args) {
        int number;
        int reversed=0;
        int digit;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        int originalNumber=number;
        for (int i = 0; number>0 ; i++) {
            digit=number%10;
            reversed=  reversed*10  +  digit;
            number/=10;
        }
        if (reversed==originalNumber){
            System.out.println("Entered Number is palindrome.");
        }else {
            System.out.println("Entered Number is Not palindrome.");
        }
    }
}
