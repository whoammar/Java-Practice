import java.util.Scanner;

public class TriangleValid41 {
    int angleOne;
    int angleTwo;
    int angleThree;

    public int getAngleSum() {
        return angleSum;
    }

    public void setAngleSum(int angleSum) {
        this.angleSum = angleSum;
    }

    int angleSum;

    public int getAngleOne() {
        return angleOne;
    }

    public void setAngleOne(int angleOne) {
        this.angleOne = angleOne;
    }

    public int getAngleTwo() {
        return angleTwo;
    }

    public void setAngleTwo(int angleTwo) {
        this.angleTwo = angleTwo;
    }

    public int getAngleThree() {
        return angleThree;
    }

    public void setAngleThree(int angleThree) {
        this.angleThree = angleThree;
    }

    public TriangleValid41(int angleOne, int angleTwo, int angleThree) {
        this.angleOne = angleOne;
        this.angleTwo = angleTwo;
        this.angleThree = angleThree;
    }

    public TriangleValid41() {
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Angles of a Triangle to check its Validity: ");
        System.out.println("Enter Angle 1: ");
        setAngleOne(scanner.nextInt());
        System.out.println("Enter Angle 2: ");
        setAngleTwo(scanner.nextInt());
        System.out.println("Enter Angle 3: ");
        setAngleThree(scanner.nextInt());
        scanner.close();
    }
    public  void calculations(){
        angleSum = angleOne+angleThree+angleTwo;
        if (angleSum>180 || angleOne>180 || angleTwo> 180 || angleThree>180){
            System.out.println("Invalid Triangle");
        } else if (angleSum<=0 || angleOne<=0 || angleTwo<=0 || angleThree<=0) {
            System.out.println("Invalid Triangle");
        }else {
            System.out.println("Valid Triangle.");
        }
    }




}
