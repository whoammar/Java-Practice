import java.util.Scanner;

public class IntCheck7 {
    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    int input;

    public IntCheck7() {
    }
    public void takeInput( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        setInput(scanner.nextInt());
    }

    public void display(){
        switch (Integer.signum(input)){
            case 1:
                System.out.println("Positive Number");
            case 0:
                System.out.println("Zero. ");
            case -1:
                System.out.println("Negative Number");
        }

    }
}
