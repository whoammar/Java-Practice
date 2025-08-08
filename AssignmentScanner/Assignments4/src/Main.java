import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Salary of Employee 1: ");
        float salary1 = scanner.nextFloat();
        System.out.println("Enter the Salary of Employee 2: ");
        float salary2 = scanner.nextFloat();
       float Average = (salary2+salary1)/2;

        System.out.println("Average salary of Employees is : "+ Average);


    }
}