import java.util.Scanner;

public class EvenOdd {
    public static  void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of Array: ");
        int length = scanner.nextInt();
        int evenCount=0;
        int oddCount=0;
        int [] arrayNum = new int [length];

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Enter the " + i + " Number: " );
            arrayNum[i] = scanner.nextInt();

            if (arrayNum[i] %2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Count of Even Number : "+ evenCount);
        System.out.println( "Count of Odd Number : " + oddCount);
    }
}
