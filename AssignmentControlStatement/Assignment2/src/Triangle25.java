import java.util.Scanner;

public class Triangle25 {
    short angleOne;

    public short getAngleOne() {
        return angleOne;
    }

    public void setAngleOne(short angleOne) {
        this.angleOne = angleOne;
    }

    public short getAngleTwo() {
        return angleTwo;
    }

    public void setAngleTwo(short angleTwo) {
        this.angleTwo = angleTwo;
    }

    public short getAngleThree() {
        return angleThree;
    }

    public void setAngleThree(short angleThree) {
        this.angleThree = angleThree;
    }

    short angleTwo;
    short angleThree;

    public Triangle25() {
    }

    //core Methods
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Angle: ");
        setAngleOne(scanner.nextShort());
        System.out.println("Enter 2nd Angle: ");
        setAngleTwo(scanner.nextShort());
        System.out.println("Enter 3nd Angle: ");
        setAngleThree(scanner.nextShort());
    }
    public void display(){
        if (angleOne + angleTwo + angleThree == 180  && angleOne > 0 && angleTwo > 0 && angleThree > 0){
            System.out.println("Triangle Formed");
        }else{
            System.out.println("Triangle Not Formed.");
        }
    }



}
