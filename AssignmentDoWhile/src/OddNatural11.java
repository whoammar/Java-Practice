import java.util.Scanner;

public class OddNatural11 {
    public static void main(String[]args){
        int n;
        int i=1;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value Of N: ");
        n=scanner.nextInt();
        do {
            if (i%2!=0){
             sum+=i;
            }
            i++;
        }while (i<=n);
        System.out.println("Sum of all odd Numbers till " +n+" is "  + sum);
    }
}
