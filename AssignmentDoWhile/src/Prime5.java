import java.util.Scanner;

public class Prime5 {
    public static void main(String[]args){
        int number;
        int i = 2;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number=scanner.nextInt();

        if (number<2){
            isPrime = false;
        }else {
            do {
                if (number%i==0){
                    isPrime = false;
                    break;
                }
i++;
            }while (i <= number / 2);

            if (isPrime){
                System.out.println("Enter Number is a Prime Number.");
            }else {
                System.out.println("Entered Number is Not a prime Number. ");
            }
        }

    }
}
