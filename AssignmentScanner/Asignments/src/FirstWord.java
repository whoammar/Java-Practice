import java.util.Scanner;

public class FirstWord {
   public static  String input;
    public void takeInput(){
        System.out.println(" Please Enter a Sentence: ");
     input = new Scanner(System.in).next();
    }
    public void display(){
        System.out.println(input);
    }
}
