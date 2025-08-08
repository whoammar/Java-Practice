import java.util.Scanner;

public class PrimeNonPrime {
    public static  void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of Array: ");
        int length = scanner.nextInt();
        int [] arrayNum = new int [length];
        boolean isPrime;
        int primeCount = 0;
        int nonPrimeCount = 0;


        for (int i = 1; i < arrayNum.length; i++) {
            System.out.println("Enter a Number: ");
            arrayNum[i] = scanner.nextInt();
            int num = arrayNum[i];
             if (num<=1){
                 nonPrimeCount++;
                 continue;
             }
             isPrime = true;
            for (int j = 2; j < Math.sqrt(num); j++) {
                if (num%j==0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                primeCount++;
            }else {
                nonPrimeCount++;
            }

        }
        System.out.println(primeCount);
        System.out.println(nonPrimeCount);

    }
}
