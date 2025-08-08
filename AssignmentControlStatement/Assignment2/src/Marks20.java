import java.util.Scanner;

public class Marks20 {

    //Getter Setter
    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistyMarks() {
        return chemistyMarks;
    }

    public void setChemistyMarks(int chemistyMarks) {
        this.chemistyMarks = chemistyMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getTotalPhysicsMaths() {
        return totalPhysicsMaths;
    }

    public void setTotalPhysicsMaths(int totalPhysicsMaths) {
        this.totalPhysicsMaths = totalPhysicsMaths;
    }
//Parameterized Constructor

    public Marks20(int totalMarks, int physicsMarks, int chemistyMarks, int mathsMarks) {
        this.totalMarks = totalMarks;
        this.physicsMarks = physicsMarks;
        this.chemistyMarks = chemistyMarks;
        this.mathsMarks = mathsMarks;
    }

    //Variables
    int totalMarks;
    int physicsMarks;
    int chemistyMarks;
    int mathsMarks;
    int totalPhysicsMaths;

//Default Constructor
    public Marks20() {
    }

    //Core Methods
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Chemistry Marks: ");
        setChemistyMarks(scanner.nextInt());
        System.out.println("Enter Physics Marks: ");
        setPhysicsMarks(scanner.nextInt());
        System.out.println("Enter Maths Marks: ");
        setMathsMarks(scanner.nextInt());
        scanner.close();
        setTotalMarks(getChemistyMarks()+getMathsMarks()+getPhysicsMarks());
        setTotalPhysicsMaths(getMathsMarks()+getPhysicsMarks());
    }
public  void display(){
        if (getPhysicsMarks()>=65 && getChemistyMarks()>= 50 && getMathsMarks()>=55){
          if (getTotalMarks()>=190 || getTotalPhysicsMaths()>=140){
              System.out.println("You are Eligible For Admission.");
          }else {
              System.out.println("You are Not Eligible For Exam.");
          }

        }else {
            System.out.println("you are not eligible for exam");
        }
}
}
