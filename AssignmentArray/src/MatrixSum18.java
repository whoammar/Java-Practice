import java.util.Scanner;

public class MatrixSum18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Taking Columns
        System.out.println("Enter the Number of Columns: ");
        int col = scanner.nextInt();

        // Taking rows
        System.out.println("Enter the Number of Rows: ");
        int row =  scanner.nextInt();

        //2d Array
        int [] [] arraysMatrix =new int [row] [col];
        //2nd 2D Array
        int [] [] arraysMatrix2 =new int [row] [col];
        System.out.println("Enter the Array Data: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arraysMatrix [i][j] = scanner.nextInt();
            }
        }
        //Collecting 2nd Array Data
        System.out.println("Enter the 2nd Array Data: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arraysMatrix2 [i][j] = scanner.nextInt();
            }
        }

        //Printing the Arrays Data Sum
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( arraysMatrix[i] [j] +    arraysMatrix2[i] [j] + " "  );
            }
            System.out.println();
        }
    }
}