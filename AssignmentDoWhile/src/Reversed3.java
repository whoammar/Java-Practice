import java.util.Scanner;

public class Reversed3 {
    public static  void main(String []args){
        int number;
        int reversed =0;
        int digit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();

        do {
            digit = number%10;
            reversed = reversed*10 + digit;
            number/=10;
        }while (number>0);
        System.out.println("Reversed Number is : " + reversed);
    }
}
