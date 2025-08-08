public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;
        int userInput = MyInput.readValidIntInRange("Please enter a number between 1 and 50: ", start, end);
        System.out.println("You entered a valid number: " + userInput);
    }
}
