import java.util.Scanner;

public class UserId13 {
    int input;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public UserId13() {
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your ID: ");
        setInput(scanner.nextInt());
        scanner.close();
    }
public void display(){
        switch (getInput()){
            case 101:
                System.out.println("User ID: 101\n" +
                        "Name: Sara Ahmed\n" +
                        "Age: 21\n" +
                        "Gender: Female\n" +
                        "Major: Computer Science\n" +
                        "GPA: 3.8\n" +
                        "Email: sara.ahmed@example.com\n" +
                        "Phone: +1-123-456-7890");
       break;
            case 102:
                System.out.println("User ID: 102\n" +
                        "Name: Ali Khan\n" +
                        "Age: 23\n" +
                        "Gender: Male\n" +
                        "Major: Mechanical Engineering\n" +
                        "GPA: 3.5\n" +
                        "Email: ali.khan@example.com\n" +
                        "Phone: +1-987-654-3210");
                break;
            case 103:
                System.out.println("User ID: 103\n" +
                        "Name: Fatima Siddiqui\n" +
                        "Age: 22\n" +
                        "Gender: Female\n" +
                        "Major: Electrical Engineering\n" +
                        "GPA: 3.9\n" +
                        "Email: fatima.siddiqui@example.com\n" +
                        "Phone: +1-456-789-1234");
                break;
            case 104:
                System.out.println("User ID: 104\n" +
                        "Name: Omar Hassan\n" +
                        "Age: 20\n" +
                        "Gender: Male\n" +
                        "Major: Business Administration\n" +
                        "GPA: 3.7\n" +
                        "Email: omar.hassan@example.com\n" +
                        "Phone: +1-321-654-9870");
                break;
            default:
                System.out.println("Invalid Id.");
        }
}
}
