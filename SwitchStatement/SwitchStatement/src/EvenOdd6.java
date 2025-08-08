import java.util.Scanner;

public class EvenOdd6 {
    int input;

    public int getReminder() {
        return reminder;
    }

    public void setReminder(int reminder) {
        this.reminder = reminder;
    }

    int reminder;

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public EvenOdd6() {
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        setInput(scanner.nextInt());
    }
    public void calculations(){
        reminder = input%2;
    }
    public void display(){
       switch (reminder){
           case 0:
               System.out.println(input + " is even.");
               break;
           case 1:
               System.out.println(input + " is Odd.");
               break;
           default:
               System.out.println("Invalid Input");
       }
     }
}
