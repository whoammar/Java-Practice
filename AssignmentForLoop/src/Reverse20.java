import java.util.Scanner;

public class Reverse20 {
    public static void main(String[] args) {
        int number;
        int reversed=0;
        int digit;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        for (int i = 0; number>0 ; i++) {
            digit=number%10;
            reversed=  reversed*10  +  digit;
            number/=10;
        }
        System.out.println( "Reversed Number is : " +reversed);
    }
}
