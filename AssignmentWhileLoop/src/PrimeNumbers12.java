import java.util.Scanner;

public class PrimeNumbers12 {
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter A Number to Check if it is Prime Number or not: ");
    int num= scanner.nextInt();
    if (num < 2) {
        System.out.println(num + " is not a prime number.");
    } else {
        boolean isPrime = true;
        int i = 2;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
}
