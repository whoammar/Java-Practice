import java.util.Scanner;

public class Factorial32 {
    public static void main(String[] args) {
        int product=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println("Factorial of " + number +  " is "    +product);
    }
}
