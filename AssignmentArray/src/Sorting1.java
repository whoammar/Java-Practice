import java.util.Scanner;
public class Sorting1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of Array: ");
        int length = scanner.nextInt();
        int [] array1 = new int[length];
        for (int i = 0; i <array1.length ; i++) {
            System.out.print("Enter the Value of  index  " +  i +  " : "  );
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length-1; i++) {
            for (int j = 0; j < array1.length-1; j++) {
             if (array1[j] > array1[j+1]){
                 int temp = array1[j];
                 array1 [j] = array1[j+1];
                 array1[j+1] = temp;
             }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
    }
}