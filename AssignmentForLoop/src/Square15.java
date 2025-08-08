import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        int n;
        int sum=0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            int square = (int) Math.pow(i,2);
            System.out.println("Square of " + i+  " is " + square);
            sum += square;

        }
        System.out.println("Sum of All Squares is : " +sum );
    }
}
