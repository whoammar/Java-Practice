import java.util.Scanner;

public class AverageSalary {
    float input1;
    float input2;
    float average;

    public void takeInput(){
        System.out.println("Enter the salary of 1st Employee: ");
        input1 = new Scanner(System.in).nextFloat();
        System.out.println("Enter the salary of 2nd Employee: ");
        input2 = new Scanner(System.in).nextFloat();
    }

    public void display(){
        average = (input1+input2)/2;
        System.out.println("Average Salary of both Employees is: "+average);

    }
}
