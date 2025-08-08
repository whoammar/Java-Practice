import java.util.Scanner;

public class NaturalSum3 {
    public static void main(String[] args) {
        int sum=0;
        int limit;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of N: ");
        limit=scanner.nextInt();
        for (int i=1;i<=limit;i++){
            sum += i;
        }
        System.out.println( "Sum of  Natural numbers is : " + sum);
    }
}
