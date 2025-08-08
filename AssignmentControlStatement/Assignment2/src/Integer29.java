import java.util.Scanner;

public class Integer29 {
    int inputInteger;

    public Integer29() {
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
        if (getInputInteger()<0){
            System.out.println(getInputInteger()+ " is a Negative value.");
        } else if (getInputInteger()==0) {
            System.out.println(getInputInteger()+ " is  Zero.");
        }else {
            System.out.println(getInputInteger() + " is a Positive value.");
        }
    }
}
