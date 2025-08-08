import java.util.Scanner;

public class Digits12 {
    public static void main(String[] args) {
    int number;
    int digits=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
        do {
            if (number>0){
                number/=10;
            }
            digits++;
        }while (number>0);
        System.out.println("Number of digits in Number is : "+ digits);
    }
}
