import java.util.Scanner;

public class CharToAscii {
    char input;
    int y;
    public void takeInput(){
        System.out.println("Please Enter a Char : ");
        input = new Scanner(System.in).next().charAt(0);
        y = input;
    }
    public void display(){
        System.out.println("ASCII value is: " +y);
    }
}
