import java.util.Scanner;

public class MySelf {
    String name;
    String fatherName;
    int age;
    String occupation;
    String goal;
    String aspiration;

    public  void takeInput(){
        System.out.println("Enter your Name: ");
        name = new Scanner(System.in).nextLine();

        System.out.println("Enter your Father's Name: ");
        fatherName = new Scanner(System.in).nextLine();

        System.out.println("Enter your Occupation: ");
        occupation = new Scanner(System.in).nextLine();

        System.out.println("Enter your goal: ");
        goal = new Scanner(System.in).nextLine();

        System.out.println("Enter your Aspiration: ");
        aspiration = new Scanner(System.in).nextLine();

        System.out.println("Enter your Age: ");
        age = new Scanner(System.in).nextInt();
    }
    public void display(){
        System.out.println("My name is "  + name + ", and my father's name is " + fatherName + ". I'm "+ age + " Years old. Currently working as a "+ occupation + ". My goal is to "+ goal+ ", and my aspiration is "+ aspiration + ".");

    }
}
