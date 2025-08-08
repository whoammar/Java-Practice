import java.util.Scanner;

public class Calculator45 {

    int valueOne;
    int valueTwo;
    char operator;

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public Calculator45(int valueOne,  char operator, int valueTwo) {
        this.valueOne = valueOne;
        this.operator = operator;
        this.valueTwo = valueTwo;
    }

    public Calculator45() {
    }
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1st value");
    setValueOne(scanner.nextInt());
    System.out.println("Enter 2nd Value");
    setValueTwo(scanner.nextInt());
    System.out.println("Enter Operator");
    setOperator(scanner.next().charAt(0));
    scanner.close();
}
public double calculation(){
        return switch (getOperator()){
            case '+' -> getValueOne() + getValueTwo();
            case '-' -> getValueOne() - getValueTwo();
            case '*' -> getValueOne() * getValueTwo();
            case '/' -> getValueOne() / getValueTwo();
            case '%' -> getValueOne() % getValueTwo();
            default -> 0.0;
        };

}

}
