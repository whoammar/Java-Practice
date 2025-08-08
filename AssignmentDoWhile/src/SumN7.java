import java.util.Scanner;

public class SumN7 {
    public static  void main(String[]args){
        int i =1;
        int n;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value Of N: ");
        n = scanner.nextInt();
        do {
            sum +=i;
            i++;
        }while (i<=n);
        System.out.println("Sum of all Natural number till " + n +" is "  + sum);
    }
}
