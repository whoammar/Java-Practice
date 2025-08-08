import java.util.Scanner;

public class Factorial5 {
    int count = 1;
    int range;
    int factorial = 1;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Factorial5() {
    }
    public void CalculateFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find Factorial: ");
        setRange(scanner.nextInt());
         while (count<=range){
            factorial = factorial*  count;
             count++;
         }
        System.out.println( "Factorial is: " + factorial);
    }
}
