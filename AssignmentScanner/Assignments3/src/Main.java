import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Char: ");
        char ch1 =scanner.next().charAt(0);

        int valueChar = ch1;
        System.out.println("American Standard Code For Information Interchange of "+ch1 +  " is "+ valueChar);

    }
}