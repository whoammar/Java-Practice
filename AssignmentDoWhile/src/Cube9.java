import java.util.Scanner;

public class Cube9 {
    public static void main(String []args){
        int n;
        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        n = scanner.nextInt();
        do {
            System.out.println( "Cube of " +i+ " is " +   Math.pow(i,3));
            i++;
        }while (i<=n);

    }
}
