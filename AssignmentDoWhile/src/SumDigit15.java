import java.util.Scanner;

public class SumDigit15 {
    public static void main(String[] args) {
        int number;
        int digit;
        int sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        number = scanner.nextInt();
        if (number<0){
            number=-number;
        }

        do {
            digit=number%10;
            sum= sum+ digit;
            number/=10;

        }while (number>0);

        System.out.println("Sum of All the digits is: "+ sum);
    }
}
