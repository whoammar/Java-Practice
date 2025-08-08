import java.util.Scanner;

public class Color20 {
    public Color20() {
    }

    char inputChar;

    public char getInputChar() {
        return inputChar;
    }

    public void setInputChar(char inputChar) {
        this.inputChar = inputChar;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character representing VIBGYOR (V, I, B, G, Y, O, R) ");
        setInputChar(scanner.next().charAt(0));
    }
    public void display(){
        switch (inputChar){
            case 'V' -> System.out.println("Violet");
            case 'I' -> System.out.println("Indigo");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'Y' -> System.out.println("Yellow");
            case 'O' -> System.out.println("Orange");
            case 'R' -> System.out.println("Red");


            default -> System.out.println("Invalid input! Please enter a character from VIBGYOR.");
        }
    }
}
