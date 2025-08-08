import java.util.Scanner;

public class MedicalLeave15 {
    private double totalClasses;
    private double totalClassesAttended;
    private double percentageClasses;
    private char medicalLeave;
    public static final  double MINIMUM_ATTENDANCE_LIMIT= 75.0;

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

    public char getMedicalLeave() {
        return medicalLeave;
    }

    public void setMedicalLeave(char medicalLeave) {
        this.medicalLeave = medicalLeave;
    }

    //Default Constructor
    public MedicalLeave15() {}

    //Parameterized Constructor
    public MedicalLeave15(double totalClasses, double totalClassesAttended, double percentageClasses, char medicalLeave) {
        this.totalClasses = totalClasses;
        this.totalClassesAttended = totalClassesAttended;
        this.percentageClasses = percentageClasses;
        this.medicalLeave = medicalLeave;
    }

    //Core Methods
    public void calculatePercentage(){
        setPercentageClasses( ( getTotalClassesAttended() / getTotalClasses() ) * 100 );
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Total Classes: ");
        setTotalClasses(scanner.nextDouble());
        System.out.println("Enter Number of Classes You Attended: ");
        setTotalClassesAttended(scanner.nextDouble());


        calculatePercentage();

        if (getPercentageClasses() < MINIMUM_ATTENDANCE_LIMIT){
            System.out.println("Do You have Any medical leave? (Y/N): ");
            setMedicalLeave(scanner.next().charAt(0));
        }

        scanner.close();
    }

    public void display(){
        System.out.println("Percentage of classes You Attended: " + getPercentageClasses() + "%");

        if (getPercentageClasses() >= MINIMUM_ATTENDANCE_LIMIT){
            System.out.println("You are Eligible for Exam.");
        } else {  // Direct else instead of else-if
            if (getMedicalLeave() == 'Y'){
                System.out.println("You are Eligible for Exam on medical basis.");
            } else {
                System.out.println("You are Not Eligible for Exam.");
            }
        }
    }
}
