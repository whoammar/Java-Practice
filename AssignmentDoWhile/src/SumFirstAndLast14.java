import java.util.Scanner;

public class SumFirstAndLast14 {
    public static void main(String[] args) {
     int number;
     int firstDigit;
     int lastDigit;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter A Number: ");
        number=scanner.nextInt();
        if (number<0){
            number=-number;
        }
        lastDigit=number%10;
        if (number < 10) {
            firstDigit = number;
        } else {
            firstDigit = number;
            do {
                firstDigit /= 10;
            } while (firstDigit >= 10);
        }
   int sum=firstDigit+lastDigit;
        System.out.println(sum);
    }

}
