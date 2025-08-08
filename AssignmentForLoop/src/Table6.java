import java.util.Scanner;

public class Table6 {
    public static void main(String[] args) {
        int value;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Table value: ");
        value=scanner.nextInt();
      for (int i=1;i<=10;i++){
          System.out.println( value + " * " + i + " = " + value*i );

      }
    }
}
