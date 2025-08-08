import java.util.Scanner;

public class Assignment10Bonus {

    //getter setter

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }

//variables
    int salary;
    int yearsInService;
    String name;
    public static final int bonusCriteria = 5;

//default constructor
    public Assignment10Bonus() {
    }
//core methods
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter Your Name: ");
    setName(scanner.nextLine());
    System.out.println("Please Enter your Years In Service : ");
    setYearsInService(scanner.nextInt());
    System.out.println("Please Enter Your salary: ");
    setSalary(scanner.nextInt());
    scanner.close();
}
public void display(){
        if(getYearsInService()>bonusCriteria){
            System.out.println("Congrats..! You got 5% Bonus. Your Salary After bonus is: " + ( ( getSalary()  ) +   getSalary()*0.5 ) );
        }else{
            System.out.println("No Bonus..! your salary is: "+ getSalary());
        }
}

}
