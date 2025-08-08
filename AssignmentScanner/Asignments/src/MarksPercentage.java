import java.util.Scanner;

public class MarksPercentage {
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    int marks6;
    double totalMarks = 600;
  double obtainedMarks;
   double percentage;

    public  void takeInput(){
        System.out.println("Enter the marks of Subject 1: ");
        marks1 = new Scanner(System.in).nextInt();
        System.out.println("Enter the marks of Subject 2: ");
        marks2 = new Scanner(System.in).nextInt();
        System.out.println("Enter the marks of Subject 3: ");
        marks3 = new Scanner(System.in).nextInt();
        System.out.println("Enter the marks of Subject 4: ");
        marks4 = new Scanner(System.in).nextInt();
        System.out.println("Enter the marks of Subject 5: ");
        marks5 = new Scanner(System.in).nextInt();
        System.out.println("Enter the marks of Subject 6: ");
        marks6 = new Scanner(System.in).nextInt();
    }

    public void display(){
        obtainedMarks = marks1+marks2+marks3+marks4+marks5+marks6;
        percentage = (obtainedMarks/totalMarks)*100;
        System.out.println(percentage);
        System.out.println(obtainedMarks);

    }

}
