import java.util.Scanner;

public class Grade17 {
    char grade;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Grade17() {
    }
    public void takeInput(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter Your Grade: ");
        setGrade(scanner.next().charAt(0));
        scanner.close();
    }
    public void display(){
        switch (getGrade()){
            case 'A':
                System.out.println("Excellent performance, exceptional understanding.");
                break;
            case 'B':
                System.out.println("Good work, strong understanding.");
                break;

            case 'C':
                System.out.println("Satisfactory, adequate grasp of concepts.");
                break;

            case 'D':
                System.out.println("Needs improvement, basic understanding.");
                break;

            case 'E':
                System.out.println("Poor performance, limited understanding");
                break;

            case 'F':
                System.out.println("Failing, inadequate understanding.");
                break;

            default:
                System.out.println("Invalid Grade");

        }
    }
}
