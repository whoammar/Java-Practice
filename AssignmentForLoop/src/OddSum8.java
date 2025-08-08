import java.util.Scanner;

public class OddSum8 {
    public static void main(String[] args) {
int n;
int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n=scanner.nextInt();
        for (int i = 1;i<=n;i++){
            if (i%2!=0){
                sum += i;
            }
        }
        System.out.println( "Sum of All the Odd Integers till "+ n+ " is "  + sum);
    }
}
