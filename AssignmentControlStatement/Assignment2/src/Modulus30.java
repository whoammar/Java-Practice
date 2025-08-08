import java.util.Scanner;

public class Modulus30 {
    int inputInteger;

    public Modulus30() {
    }

    public int getInputInteger() {
        return inputInteger;
    }

    public void setInputInteger(int inputInteger) {
        this.inputInteger = inputInteger;
    }
    public  void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter An Integer Value: ");
        setInputInteger(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        if(getInputInteger() % 5 ==0 && getInputInteger() % 11 ==0){
            System.out.println("Number is divisible by 5 and 11");
        }else {
            System.out.println("Number is not Divisible by 11 and 5");
        }

    }
}
