import java.util.Scanner;

public class StringLength {
    String input;
    public  void takeInput(){
        System.out.println("Enter a sentence: ");
        input = new Scanner(System.in).next();
    }
    public void display(){
        System.out.println("Length is:  "+input.length());
}
}
