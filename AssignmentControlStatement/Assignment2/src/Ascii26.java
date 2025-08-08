import java.util.Scanner;

public class Ascii26 {
    char input;

    public int getConvertedChar() {
        return convertedChar;
    }

    public void setConvertedChar(int convertedChar) {
        this.convertedChar = convertedChar;
    }

    int convertedChar;

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public Ascii26() {
    }

    public Ascii26(char input) {
        this.input = input;
    }


    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Any Character: ");
        setInput(scanner.next().charAt(0));

        scanner.close();
setConvertedChar( (int)  getInput());
    }
    public void display(){
        if (getConvertedChar() >= 65 && getConvertedChar() <= 90){
            System.out.println("Upper Case");
        } else if (getConvertedChar() >= 97 && getConvertedChar() <= 122) {
            System.out.println("Lower Case");
        } else if (getConvertedChar() >= 48 && getConvertedChar() <= 57) {
            System.out.println("Decimal Digits");
        }else {
            System.out.println("Special Characters");
        }

    }

}
