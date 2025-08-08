import java.util.Scanner;

public class AgeInSeconds {
    int age;
    long ageInSeconds;
    public void takeInput(){
        System.out.println("Enter your Age in Seconds: ");
        age = new Scanner(System.in).nextInt();}
    public void display(){
        ageInSeconds= age*365*24*60*60;
        System.out.println("Your age in seconds: "+ ageInSeconds);
    }
}
