import java.util.Scanner;

public class Time43 {
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
int hours;
int minutes;
    public Time43() {
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hour: ");
        setHours(scanner.nextInt());
        System.out.println("Enter Minutes: ");
        setMinutes(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        if (hours>=12){
            System.out.println("It's PM ");
        }else {
            System.out.println("It's AM ");
        }
    }
}
