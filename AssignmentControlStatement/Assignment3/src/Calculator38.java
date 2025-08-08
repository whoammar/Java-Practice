import javax.xml.transform.Result;
import java.util.Scanner;

public class Calculator38 {
int  valueOne;
int valueTwo;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    int result;


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

    public Calculator38() {
    }
    public void takeInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        setValueOne(scanner.nextInt());
        System.out.println("Enter 2nd Value: ");
        setValueTwo(scanner.nextInt());
        scanner.close();
    }
    public void add(){
        result = valueOne+ valueTwo;
        System.out.println("Result of add: "+ result);
    }
    public void multiply(){
        result = valueOne* valueTwo;
        System.out.println("Result of multiply: "+ result);
    }
    public void subtraction(){
        result = valueOne - valueTwo;
        System.out.println("Result of subtraction: "+ result);
    }
    public void division(){
        result = valueOne / valueTwo;
        System.out.println("Result of  division: "+ result);
    }


}
