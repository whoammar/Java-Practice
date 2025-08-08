import java.util.Scanner; // Import the Scanner class to take input from the user.

public class MyInput {
    public static int readValidInt(String outMessage) {
        System.out.print(outMessage);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid Int! It should be int\n" + outMessage);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
    public static int readValidIntInRange(String outMessage, int start, int end) {
        int value = readValidInt(outMessage);
        while (!valueIsInRange(value, start, end)) {
            System.out.println("Invalid Range! " + value + " it should be between " + start + " to " + end);
            value = readValidInt(outMessage);
        }
        return value;
    }
    public static boolean valueIsInRange(int value, int start, int end) {
        return value >= start && value <= end;
    }
}