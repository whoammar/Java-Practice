import java.util.Scanner;

public class DoubleToInt {
    double input;
    public void takeInput(){
        System.out.println("Enter a Double Value: ");
        input =new Scanner(System.in).nextDouble();
    }
    public void display(){
        int y = (int) input;
        System.out.println("Your Value in Integer is : "+ y);
    }
}
