import java.util.Scanner;

public class Salary33 {
    public Salary33() {
    }

    double salaryEmployee;

    public double getSalaryAllowance() {
        return salaryAllowance;
    }

    public void setSalaryAllowance(double salaryAllowance) {
        this.salaryAllowance = salaryAllowance;
    }

    double salaryAllowance;

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
    public  void takeInput(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter Your Salary: ");
        setSalaryEmployee(scanner.nextDouble());
        scanner.close();
    }
    public void calculationsDisplay(){
        if (salaryEmployee<=10000){
            salaryAllowance = salaryEmployee * (1 + 0.20 + 0.80);
            System.out.println("Your salary After Allowance is : "+ salaryAllowance);
        }if (salaryEmployee<=20000){
            salaryAllowance = salaryEmployee * (1 + 0.25 + 0.90);
            System.out.println("Your salary After Allowance is : "+ salaryAllowance);
        }if (salaryEmployee>20000){
            salaryAllowance = salaryEmployee * (1 + 0.30 + 0.95);
            System.out.println("Your salary After Allowance is : "+ salaryAllowance);
        }

    }

}
