public class Main {
    public static void main(String[] args) {
Student student1 = new Student();
student1.setName("Ammar");
student1.setRollNo(10);
Student student = new Student(10);
Student student4 = new Student("Ammar");
Student student2 = new Student(10, "Ammar");
Student student3 = new Student("Ammar",10);
Student student5 = new Student(student2);

        }
    }



