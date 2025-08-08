import java.util.Scanner;

public class EvenOddSum4 {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int number;
        System.out.println("Enter any integer to find sum 0r Any character for results: ");
        Scanner scanner = new Scanner(System.in);
do {
    if (scanner.hasNextInt()){
        number= scanner.nextInt();
        if (number%2==0){
            sumOfEven += number;
        }else {
            sumOfOdd += number;
        }
    }else {
        break;
    }

}while (true);
        System.out.println("Sum of Even Numbers : " + sumOfEven + " Sum of Odd Numbers: " + sumOfOdd);
    }
}
