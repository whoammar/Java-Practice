import java.util.Scanner;

public class AsciiCheck4 {
    char input;

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public AsciiCheck4() {
    }

    public AsciiCheck4(char input) {
        this.input = input;
    }
    public  void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything to check if it is char or Integer or a special char: ");
   setInput(scanner.next().charAt(0));
   scanner.close();
    }

    public void display(){
       switch (Character.getType(input)){
           case Character.UPPERCASE_LETTER:
               System.out.println("Upper Case.");
               break;
           case Character.LOWERCASE_LETTER:
               System.out.println("Lower Case.");
               break;
           case Character.DECIMAL_DIGIT_NUMBER:
               System.out.println("Digits.");
               break;
           default:
               System.out.println("Special Character");
       }


    }
}
