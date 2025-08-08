import java.util.Scanner;

public class MultiplyDigits19 {
    public static void main(String []args){
        int number;
        int digit;
        int product =1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number ");
        number = scanner.nextInt();
    while (number>0){
        digit =number%10;

        product *=  digit;
        number/=10;
    }
        System.out.println( "Product of Digits is: " + product);
    }
}
