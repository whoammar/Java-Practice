import java.util.Scanner;

public class Password12 {
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    String input;
    String enteredPassword = "password123";
    public Password12() {
    }
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your password: ");
    setInput(scanner.next());
    scanner.close();
}
public void display(){
        switch (getInput()){
            case "password123":
                System.out.println("Entered password is correct.");
                break;
            default:
                System.out.println("Password Incorrect. ");
        }
}
}
