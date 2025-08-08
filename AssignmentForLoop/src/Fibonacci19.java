import java.util.Scanner;

public class Fibonacci19 {
    public static void main(String[]args){
        int a=0;
        int b=1;
        int term;
        Scanner scanner= new Scanner(System.in);
        term =scanner.nextInt();
        for (int i = 1; i <term; i++) {
            System.out.println(a + " ");
           int  c=a+b;
            a=b;
            b=c;
        }
    }
}
