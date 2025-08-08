import java.util.Scanner;

public class ArraySum2 {
    public static void main(String[]args){
        int sum = 0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int length = scanner.nextInt();
        int [] arrayInt = new int[length];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Enter the value of " + i  + "index : " );
           arrayInt [i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        System.out.println("Sum: " + sum);
    }
}
