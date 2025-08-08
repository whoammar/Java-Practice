import java.util.Scanner;

public class LeapYear {

    int year;

    //getter setter

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //default Constructor
    public LeapYear() {
    }
public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter year to check if it is Leap Year ");
    setYear(scanner.nextInt());
    scanner.close();
}
    public void display(){
        if(getYear()%4==0 && getYear()%100 !=0 || getYear()%400==0){
            System.out.println(getYear()+ "  is a leap year.");
        }else {
            System.out.println(getYear() +" is not leap");
        }
    }
}
