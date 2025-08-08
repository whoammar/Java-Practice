import java.util.Scanner;

public class EvenOddSum34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input: ");
        int n=scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter n Integers: ");
        for (int i = 0; i < n; i++) {
          int number = scanner.nextInt();
          if (number%2==0){
              sumEven+=number;
          }else {
              sumOdd+=number;
          }
        }
        System.out.println("Sum of Even Numbers is: " + sumEven);
        System.out.println("Sum of Odd Numbers is: " + sumOdd);
    }
}
