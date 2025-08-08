import java.util.Scanner;

public class SumDigits18 {
    public static void main(String []args){
        int number;
        int digits;
        int sum=0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = scanner.nextInt();

        while (number>0){
           digits= number%10;

            sum += digits;
        number/=10;

        }
        System.out.println(sum);
    }

}