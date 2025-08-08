import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Average8 {
  public static  void main(String[]args){
      int number;
      int sum =0;
      int i=1;

      Scanner scanner = new Scanner(System.in);
      do {
          System.out.println("Enter a Number: ");
          number = scanner.nextInt();
          sum +=number;

          i++;
      }while (i<=10);
      System.out.println( "Sum of 10 Numbers is : " + sum);
  }
}
