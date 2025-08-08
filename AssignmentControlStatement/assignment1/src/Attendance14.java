import java.util.Scanner;

public class Attendance14 {


//Constructor
    public Attendance14() {
    }
    //Getter Setter

    public double getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(double totalClasses) {
        this.totalClasses = totalClasses;
    }

    public double getTotalClassesAttended() {
        return totalClassesAttended;
    }

    public void setTotalClassesAttended(double totalClassesAttended) {
        this.totalClassesAttended = totalClassesAttended;
    }

    public double getPercentageClasses() {
        return percentageClasses;
    }

    public void setPercentageClasses(double percentageClasses) {
        this.percentageClasses = percentageClasses;
    }


    //Variables
    double totalClasses;
    double totalClassesAttended;
    double percentageClasses;
   public static final  double MINIMUM_ATTENDANCE_LIMIT= 75.0;
//methods
    public  void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Total Classes: ");
        setTotalClasses(scanner.nextDouble());
        System.out.println("Enter Number of classes You attended: ");
        setTotalClassesAttended(scanner.nextDouble());
        scanner.close();
   setPercentageClasses(  (getTotalClassesAttended()/getTotalClasses()) *100 );
    }
public void display(){
    System.out.println("Percentage of classes You Attended: "+ getPercentageClasses());
        if (getPercentageClasses()>=MINIMUM_ATTENDANCE_LIMIT){
            System.out.println("You are Eligible for Exam.");
        }else {

            System.out.println("Sorry Your are Not Eligible for Exam.");
        }

}
}
