import java.util.Scanner;

public class Largest38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter How many numbers you want to Enter: ");
        int n=  scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + " number");
            int number=scanner.nextInt();
             if (number>largest){
                 largest = number;
             }if (number<smallest){
                smallest = number;
            }

        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);


    }
}
