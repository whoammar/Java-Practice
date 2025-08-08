import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Marks of Islamic Studies: ");



        int marks1 = scanner.nextInt();
        System.out.println("Please Enter your Marks of Data Structures: ");
        int marks2 = scanner.nextInt();
        System.out.println("Please Enter your Marks of Object Oriented Programming: ");
        int marks3 = scanner.nextInt();
        System.out.println("Please Enter your Marks of  Database Management: ");
        int marks4 = scanner.nextInt();
        System.out.println("Please Enter your Marks of Artificial Intelligence: ");
        int marks5 = scanner.nextInt();
        System.out.println("Please Enter your Marks of Software Testing: ");
        int marks6 = scanner.nextInt();



        int totalMarks = marks1+marks2+marks3+marks4+marks5+marks6;
        double totalMarkss = totalMarks;
        System.out.println("Total Obtained Marks: "+ totalMarks);

        double percentage =(totalMarkss/600) *100;
        System.out.println("Percentage is : "+ percentage);
    }
}