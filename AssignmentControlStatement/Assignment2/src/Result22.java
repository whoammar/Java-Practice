import java.util.Scanner;

public class Result22 {
    //Default Constructor

    public Result22() {
    }
    //parameterized Constructor

    public Result22(int rollNo, String name, double marksOne, double marksTwo, double marksThree) {
        this.rollNo = rollNo;
        this.name = name;
        this.marksOne = marksOne;
        this.marksTwo = marksTwo;
        this.marksThree = marksThree;
    }
    //Variables

    String name;
    double marksOne;
    double marksTwo;
    double marksThree;
    int rollNo;
    double ObtainedMarks;
    double percentageTotal;
    public  static final double totalMarks = 300;

    //getter setter
    public double getObtainedMarks() {
        return ObtainedMarks;
    }

    public void setObtainedMarks(double totalMarks) {
        this.ObtainedMarks = totalMarks;
    }

    public double getPercentageTotal() {
        return percentageTotal;
    }

    public void setPercentageTotal(double percentageTotal) {
        this.percentageTotal = percentageTotal;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarksThree() {
        return marksThree;
    }

    public void setMarksThree(double marksThree) {
        this.marksThree = marksThree;
    }

    public double getMarksTwo() {
        return marksTwo;
    }

    public void setMarksTwo(double marksTwo) {
        this.marksTwo = marksTwo;
    }

    public double getMarksOne() {
        return marksOne;
    }

    public void setMarksOne(double marksOne) {
        this.marksOne = marksOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //core Methods

    public void takeInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        setName(scanner.nextLine());

        System.out.println(" Enter Your Roll No: ");
        setRollNo(scanner.nextInt());

        System.out.println("Enter Marks of 1st subject out of 100: ");
        setMarksOne(scanner.nextDouble());

        System.out.println("Enter Marks of 2nd subject out of 100: ");
        setMarksTwo(scanner.nextDouble());

        System.out.println("Enter Marks of 3rd subject out of 100:");
        setMarksThree(scanner.nextDouble());

        scanner.close();

    }
    public void calculations(){
        setObtainedMarks( getMarksOne()+getMarksTwo()+getMarksThree());
        setPercentageTotal(  (getObtainedMarks()/totalMarks) * 100);
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Total Obtained Marks: " +getObtainedMarks());
        System.out.println("Percentage: " + getPercentageTotal());
        if(getPercentageTotal()>=60){
            System.out.println("First Division");
        } else if (getPercentageTotal()>=50) {
            System.out.println("Second Division");
        } else if (getPercentageTotal()>=40) {
            System.out.println("Third Division");
        }else {
            System.out.println("Fail");
        }


    }

}
