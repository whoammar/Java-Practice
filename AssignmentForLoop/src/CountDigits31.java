import java.util.Scanner;

public class CountDigits31 {
    public static void main(String[] args) {
        int number;
        int count=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();
       for (;number>0;number/=10){
           count++;
       }
        System.out.println("Digit Count is : "+ count);
    }
}
