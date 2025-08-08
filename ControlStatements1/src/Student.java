import java.util.Scanner;

public class Student {
    public static final short passingMarks = 60;
    short rollNo;
    String name;
    short ObtainedMarks;

    public short getObtainedMarks() {
        return ObtainedMarks;
    }

    public void setObtainedMarks(short obtainedMarks) {
        ObtainedMarks = obtainedMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getRollNo() {
        return rollNo;
    }

    public void setRollNo(short rollNo) {
        this.rollNo = rollNo;
    }

//Default Constructor
    public Student() {
    }

//Parameterized Constructor
    public Student(short rollNo, String name, short obtainedMarks) {
        this.rollNo = rollNo;
        this.name = name;
        ObtainedMarks = obtainedMarks;
    }
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your Name: ");
    setName(scanner.nextLine());
    System.out.println("Enter your Roll No: ");
    setRollNo(scanner.nextShort());
    System.out.println("Enter Obtained Marks: ");
    setObtainedMarks(scanner.nextShort());
    scanner.close();
}
public void display(){
    System.out.println(name);
    System.out.println(rollNo);
    if  (ObtainedMarks>=passingMarks){
        System.out.println("PASS...!");
    }
    else {
        System.out.println("Fail...! ");
    }

}
}
