import java.util.Scanner;

public class Tables7 {
    public static void main(String[] args) {
        int tableValue;
        int n=10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Table Value (n): ");
        tableValue = scanner.nextInt();
        for (int i=1 ; i<=n ; i++){
            for (int j=1;j<=tableValue;j++){
                System.out.printf("%d * %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
