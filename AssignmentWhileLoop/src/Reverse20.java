import java.util.Scanner;

public class Reverse20 {

  public static void main (String []args){
      int number;
      int reverse=0;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number: ");
      number = scanner.nextInt();

      while (number > 0) {
          int digit = number % 10;
          reverse = reverse * 10 + digit;
          number /= 10;
      }
      System.out.println("Reversed number is: " + reverse);
  }
}