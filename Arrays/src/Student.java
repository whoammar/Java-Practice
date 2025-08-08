import java.util.Scanner;

public class Student {
    //Variables
    String name;
    int rollNo;
    float fee;

    //Getter Setter
    public String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    //Constructors
    public Student(String name, int rollNo, float fee) {
        this.name = name;
        this.rollNo = rollNo;
        this.fee = fee;
    }

    public Student() {
    }

    //Core Methods
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        setName(scanner.nextLine());
        System.out.println("Enter your Roll NO: ");
        setRollNo(scanner.nextInt());
        System.out.println("Enter Your Fee Amount: ");
        setFee(scanner.nextFloat());
    }
    public void display(){
        System.out.println("The Student Name : " + getName()+  "  has Roll No : " + getRollNo() + " is paying fee amount of : "+ getFee());
    }
public static  void main(String []args){
    Student [] list  = new Student[5];
    for (int i = 0; i < list.length; i++) {
        list[i]=new Student();
        list [i].takeInput();
    }
    for (int i = 0; i < list.length; i++) {
        list[i].display();
    }

}
}
