import java.util.Scanner;

public class Series16 {
    public static void main(String[] args) {
         int n;
         int currentTerm =0;
         int sum =0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n = scanner.nextInt();
        for (int i=1;i<=n;i++){
           currentTerm = currentTerm*10+1;
            sum += currentTerm;
            System.out.println("Current term is : " + currentTerm);
        }
        System.out.println("Sum is: " + sum);
    }
}
