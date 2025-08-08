import java.util.Scanner;

public class Insert8 {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of New Array: ");
        int length = scanner.nextInt();

        int [] arrayOriginal = new int[length];
        for (int i = 0; i <arrayOriginal.length ; i++) {
            System.out.println("Enter the Values of Index : " + i + " for Original Array : "  );
            arrayOriginal [i] =scanner.nextInt();
        }
        System.out.println("Enter the Element You want add: ");
        int newElement = scanner.nextInt();
        System.out.println("Enter the Index You want to add value: ");
         int index = scanner.nextInt();
       arrayOriginal[index] = newElement;
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i]+ "  " );
        }
        }
    }

