import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value in double : ");
        double valueDouble =scanner.nextDouble();
        int y = (int) valueDouble;
        System.out.println("Your Value in Integer is " + y);
    }
}