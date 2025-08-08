import java.util.Scanner;

public class Quadrant19 {

    //Getter Setter
    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    //Variables
    int xAxis;
    int yAxis;

    //Default Constructor
    public Quadrant19() {
    }

    //Core Methods
    public void takeInput ( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value Of X-Axis: ");
        setxAxis(scanner.nextInt());

        System.out.println("Enter Value Of Y-Axis: ");
        setyAxis(scanner.nextInt());
        scanner.close();
    }
    public void quadrantCheck(){
//        Quadrant 1: (x > 0, y > 0)
//        Quadrant 2: (x < 0, y > 0)
//        Quadrant 3: (x < 0, y < 0)
//        Quadrant 4: (x > 0, y < 0)
        if (xAxis>0 && yAxis>0){
            System.out.println("Quadrant 1");
        } else if (xAxis<0 && yAxis>0){
            System.out.println("Quadrant 2");
        } else if (xAxis<0 && yAxis<0){
            System.out.println("Quadrant 3");
        }else if (xAxis>0 && yAxis<0){
            System.out.println("Quadrant 4");
        }
        else {
            System.out.println("input does not lie in any quadrant");
        }

    }


}
