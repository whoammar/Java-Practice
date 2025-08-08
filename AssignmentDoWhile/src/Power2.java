import java.util.Scanner;

public class Power2 {
    public static void main (String[]args){
        int base;
        int exponent;
        int result=1;
        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base : ");
        base = scanner.nextInt();
        System.out.println("Enter Exponent : ");
        exponent = scanner.nextInt();
        do {
            result *=base;
            i++;
        }while (i<=exponent);
        System.out.println(result);
    }
}
