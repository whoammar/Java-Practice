import java.util.Scanner;

public class Triangle24 {
    public Triangle24(short sideOne, short sideTwo, short sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public Triangle24() {
    }

    public short getSideOne() {
        return sideOne;
    }

    public void setSideOne(short sideOne) {
        this.sideOne = sideOne;
    }

    public short getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(short sideTwo) {
        this.sideTwo = sideTwo;
    }

    public short getSideThree() {
        return sideThree;
    }

    public void setSideThree(short sideThree) {
        this.sideThree = sideThree;
    }

    short sideOne;
    short sideTwo;
    short sideThree;


    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of 1st side: ");
        setSideOne(scanner.nextShort());
        System.out.println("Enter value of 2nd side: ");
        setSideTwo(scanner.nextShort());
        System.out.println("Enter value of 3rd side: ");
        setSideThree(scanner.nextShort());
         scanner.close();
    }
    public  void display(){
        if (sideOne == sideTwo && sideTwo == sideThree){
            System.out.println("Equilateral Triangle");
        }else {
            if (sideOne ==sideTwo || sideThree == sideOne || sideTwo == sideThree){
                System.out.println("Isosceles Triangle");
            }else {
                if (sideOne!=sideTwo && sideTwo!=sideThree){
                    System.out.println("Scalene triangle");
                }else {
                    System.out.println("Invalid Input");
                }
            }
        }



    }

}
