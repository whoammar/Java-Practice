import java.util.Scanner;

public class Gender14 {
    char input;

    public Gender14() {
    }

    public char getInput() {
        return input;
    }

    public void setInput(char input) {
        this.input = input;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Your Gender: ");
        setInput(scanner.next().charAt(0));
        scanner.close();
    }
    public void display(){
        switch (getInput()){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
