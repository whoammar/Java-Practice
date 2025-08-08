import java.util.Scanner;

public class Remove6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int length = scanner.nextInt();
        int[] arrayInt = new int[length];

        // Populate array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Enter the value at index " + i + ": ");
            arrayInt[i] = scanner.nextInt();
        }

        System.out.println("Enter the Element to Delete: ");
        int delete = scanner.nextInt();

        // Remove the element by shifting
        boolean found = false;
        for (int i = 0; i < arrayInt.length - 1; i++) {
            if (found || arrayInt[i] == delete) {
                found = true;
                arrayInt[i] = arrayInt[i + 1];
            }
        }

        // Print modified array (excluding last element)
        for (int i = 0; i < arrayInt.length - (found ? 1 : 0); i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
