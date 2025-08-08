import java.util.Scanner;

public class Calculator8 {
    int num1;
    char operator;
    int num2;

    public Calculator8(int num1, char operator, int num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public Calculator8() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Value");
        setNum1(scanner.nextInt());
        System.out.println("Enter Operator");
        setOperator(scanner.next().charAt(0));
        System.out.println("Enter 2nd Value");
        setNum2(scanner.nextInt());

    }
    public double display(){
       return switch (getOperator()){
            case '+' -> getNum1()+getNum2();
            case '-' -> getNum1()-getNum2();
            case '*' -> getNum1()*getNum2();
            case '%' -> getNum1()%getNum2();
            case '/'->  getNum1()/getNum2();
           default ->  0.0;
        };
    }
}
