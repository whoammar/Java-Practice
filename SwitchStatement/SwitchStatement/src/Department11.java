import java.util.Scanner;

public class Department11 {
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    String input;

    public Department11() {
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Department id: ");
        setInput(scanner.next());
        scanner.close();
    }
    public void display( ){
        switch (getInput()){
            case "CS-1" :
                System.out.println("Computer Science");
                break;
            case "AD-0" :
                System.out.println("Anonymous Department");
                break;
            case "SE-2" :
                System.out.println("Software Engineering");
                break;
            case "IT-3" :
                System.out.println("Information Technology");
                break;
            case "AI-4" :
                System.out.println("Artificial Intelligence");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
