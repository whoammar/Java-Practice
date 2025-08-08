import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Average7 {
    int count = 1;
    int value;
    int sum;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        while(count<=10){
            System.out.println("Enter 10 Value: ");
           setValue(scanner.nextInt());
           sum = value+sum;
            count++;
        }
        System.out.println("Sum is :  " + sum);
        System.out.println("Average is :  " + sum/10);
    }
}