import java.util.Scanner;

public class Digits13 {
    String input;
    int i = 0;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        setInput(scanner.next());
    }

    public void display() {
        while (i < input.length()) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            System.out.print(displayInEnglish(digit) + " ");
            i++;
        }
    }

    public String displayInEnglish(int digit) {
        return switch (digit) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 0 -> "Zero";
            default -> "Invalid Input";
        };
    }

}
