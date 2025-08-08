import java.util.Scanner;

public class Long19 {
    long inputValue;
    long lastDigit;
    int lastInt;

    public Long19() {
    }

    public long getInputValue() {
        return inputValue;
    }

    public void setInputValue(long inputValue) {
        this.inputValue = inputValue;
    }

    public long getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(long lastDigit) {
        this.lastDigit = lastDigit;
    }

    public int getLastInt() {
        return lastInt;
    }

    public void setLastInt(int lastInt) {
        this.lastInt = lastInt;
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long value: ");
        setInputValue(scanner.nextLong());

    }

    public void calculateLastDigit() {
        setLastDigit(getInputValue() % 10);
        setLastInt((int) getLastDigit());
    }

    public long display() {
        return switch (getLastInt()) {
            case 1 -> inputValue / 10;
            case 5 -> inputValue / 100;
            case 9 -> inputValue / 1000;
            default -> inputValue / 20;
        };
    }


}
