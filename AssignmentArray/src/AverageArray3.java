import java.util.Scanner;

public class AverageArray3 {
    public static void main(String[] args) {
        int arraySum=0;
        int arrayAverage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of Array: ");
        int lengthOfArray = scanner.nextInt();
        int [] arrayOfAverage = new int [lengthOfArray];
        for (int i = 0; i < arrayOfAverage.length; i++) {
            System.out.println("Enter the Value of Index " + i+ " : ");
            arrayOfAverage [i]= scanner.nextInt();
            arraySum += arrayOfAverage[i];}

        arrayAverage = arraySum/lengthOfArray;
        System.out.println("Average Value of Array is : " + arrayAverage);
    }
}
