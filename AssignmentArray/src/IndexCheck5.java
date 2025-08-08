import java.util.Scanner;

public class IndexCheck5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Length of Array : ");
        int length = scanner.nextInt();
        int [] array = new int[length];
        System.out.println("Enter the value you want to find the Index of: ");
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the Value of Index " + i+ " : ");
            array [i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==value){
                System.out.println("Array Contains the Entered value at index : " + i );
            }
        }
    }
}