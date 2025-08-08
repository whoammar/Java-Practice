import java.util.Scanner;

public class MinMax9 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of New Array: ");
        int length = scanner.nextInt();

        int [] array = new int[length];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter the Values of Index : " + i + " : "  );
            array [i] =scanner.nextInt();
        }
        int maximum = array[0];
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum){
                maximum = array[i];
            }else if (array[i]<minimum){
                minimum = array[i];
            }
        }
        System.out.println("Maximum Number in array is : " + maximum);
        System.out.println("Minimum Number in array is : " + minimum);
    }
}
