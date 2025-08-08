public class Student {
   private int rollNo;
   private String name;

   //Default Constructor
   public Student(){
       rollNo =10;
       name ="Ammar";
   }
//Parameterized constructor
    public Student(int rollNo){
 this.rollNo =10;
 this.name="Ammar";
    }

    public Student(String name){
       this.name ="Ammar";
        this.rollNo =10;
    }

    public  Student(int rollNo, String name){
       this.rollNo = rollNo;
       this.name = name;

    }
    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
//Copy constructor
    public Student(Student student){
       this.rollNo = rollNo;
       this.name = name;
    }



    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
