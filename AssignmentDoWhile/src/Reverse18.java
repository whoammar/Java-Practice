import java.util.Scanner;

public class Reverse18 {
    public static void main(String[] args) {
        int number;
        int digit;
        int reversed=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        number= scanner.nextInt();
        if (number<0){
            number=-number;
        }
          do {
          digit = number % 10;
              reversed = reversed * 10 + digit;
              number /= 10;
          }while (number>0);
        System.out.println(  "Reversed number is: " + reversed);
    }
}
