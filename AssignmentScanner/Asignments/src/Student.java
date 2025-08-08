public class Student {
    // Data Members***********************
    private String name;
    private short rollNo;
    private double fee;
    private static int studentCount = 0;
    private int lastYearMarks;
    private int presentYearMarks;
    private int totalMarks;
    private int obtainMarks;

    // Getter Methods**************************

    public int getTotalMarks() {
        return totalMarks;
    }
    public int getObtainMarks() {
        return obtainMarks;
    }
    public int getPresentYearMarks() {
        return presentYearMarks;
    }
    public int getLastYearMarks() {
        return lastYearMarks;
    }

    public short getRollNo() {
        return rollNo;
    }

    public double getFee() {
        return fee;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getName() {
        return name;
    }

    // Setter Methods****************************
    public void setObtainMarks(int obtainMarks) {
        this.obtainMarks = obtainMarks;
    }


    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setPresentYearMarks(int presentYearMarks) {
        this.presentYearMarks = presentYearMarks;
    }

    public void setLastYearMarks(int lastYearMarks) {
        this.lastYearMarks = lastYearMarks;
    }
    public void setRollNo(short rollNo) {
        this.rollNo = rollNo;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int lastYearMarks, int presentYearMarks, int totalMarks, int obtainMarks) {
        this.lastYearMarks = lastYearMarks;
        this.presentYearMarks = presentYearMarks;
        this.totalMarks = totalMarks;
        this.obtainMarks = obtainMarks;
    }
    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }
    // Constructors*****************************
    // Default Constructor
    public Student() {
        this.rollNo = 10;
        this.name="ali";
        this.fee = 1500.00;
        studentCount++; // Increment student count
    }

    // Parameterized Constructor
    public Student(short rollNo, String name, double fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
        studentCount++; // Increment student count
    }

    // Copy Constructor
    public Student(Student student) {
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.fee = student.fee;
    }

    // fee without discount
    public double calcFeeWithoutDiscount() {
        return fee;
    }

    // fee with discount
    public double calcFeeWithDiscount(int discountPercentage) {
        return fee - (fee * discountPercentage / 100);
    }

    // average marks
    public int calcAvg(int lastYearMarks, int presentYearMarks) {
        return (lastYearMarks + presentYearMarks) / 2;
    }

    // percentage of obtained marks
    public int calcPercentage(int totalMarks, int obtainMarks) {
        return (int) ((double) obtainMarks / totalMarks * 100);
    }

    // Method to print all student info
    public void print() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Fee: " + fee);
        System.out.println("Student Count: " + studentCount);
    }
}
