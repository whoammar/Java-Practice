import java.util.Scanner;

public class Count35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input: ");
        int n=scanner.nextInt();
        int zeroCount = 0;
        int negativeCount=0;
        int positiveCount = 0;
        System.out.println("Enter n Integers: ");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number<0){
                negativeCount++;
            }else if (number>0){
                positiveCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.println("Zero Count is : " + zeroCount);
        System.out.println("Positive Numbers Count is : " + positiveCount);
        System.out.println("Negative Numbers Count is : " + negativeCount);
    }
}
