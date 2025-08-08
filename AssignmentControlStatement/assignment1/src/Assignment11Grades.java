import java.util.Scanner;

public class Assignment11Grades {
    //Default Constructor
    public Assignment11Grades() {
    }
//getter setter
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
//variables
    int marks;

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Marks out of 100: ");
        setMarks(scanner.nextInt());
        scanner.close();
    }
     public void display(){
        if(getMarks()>80){
            System.out.println("Your marks :  " + getMarks() + " You got Grade A");
        } else if (getMarks()>= 70 && getMarks()<80) {

            System.out.println("Your marks :  " + getMarks() + ". You got Grade B");

        } else if (getMarks()>= 60 && getMarks()<70) {

            System.out.println("Your marks :  " + getMarks() + ". You got Grade C");

        }else if (getMarks()>= 50 && getMarks()<60) {

            System.out.println("Your marks :  " + getMarks() + ". You got Grade D");

        }else if (getMarks()>= 40 && getMarks()<50) {

            System.out.println("Your marks :  " + getMarks() + ". You got Grade E");

        }else if (getMarks()>= 30 && getMarks()<40) {

            System.out.println("Your marks :  " + getMarks() + ". You got Grade F");

        }


     }
}
