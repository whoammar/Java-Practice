import java.util.Scanner;

public class age12 {
    int ageOne;
    int ageTwo;
    int ageThree;



    //Default Constructor
    public age12() {
    }


    //getter setter
    public int getAgeOne() {
        return ageOne;
    }

    public void setAgeOne(int ageOne) {
        this.ageOne = ageOne;
    }

    public int getAgeTwo() {
        return ageTwo;
    }

    public void setAgeTwo(int ageTwo) {
        this.ageTwo = ageTwo;
    }

    public int getAgeThree() {
        return ageThree;
    }

    public void setAgeThree(int ageThree) {
        this.ageThree = ageThree;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age of First Person : ");
        setAgeOne(scanner.nextInt());
        System.out.println("Enter Age of Second person : ");
        setAgeTwo(scanner.nextInt());
        System.out.println("Enter Age of Third person : ");
        setAgeThree(scanner.nextInt());
        scanner.close();}
    public void display(){
        System.out.println("The eldest one is "+   Math.max(ageOne, Math.max(ageTwo,ageThree)) + " Years Old.");
        System.out.println("The Youngest one is "+   Math.min(ageOne, Math.min(ageTwo,ageThree)) + " Years Old.");

    }
}
