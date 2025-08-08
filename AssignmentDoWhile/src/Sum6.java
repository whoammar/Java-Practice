import java.util.Scanner;

public class Sum6 {
    public static void main(String []args){
        int i=1;
        int sum = 0;
        do {
            sum +=i;
            i++;
        }while (i<=10);
        System.out.println("The sum of 10 Natural Numbers is: " + sum);
    }
}
