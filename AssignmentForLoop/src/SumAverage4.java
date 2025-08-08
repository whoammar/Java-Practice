import java.util.Scanner;

public class SumAverage4 {
    public static void main(String[]args){
        int number;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("Enter a number: ");
            number= scanner.nextInt();
            sum +=number;
        }
        System.out.println(" Sum of 10 Numbers is : " + sum);
        int average=sum/10;
        System.out.println("Average of 10 numbers is : " + average);
    }
}
