import java.util.Scanner;

public class Assignment7Square {

    double height;
    double breadth;

    //Getter Setter
    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Height: ");
        setHeight(scanner.nextInt());

        System.out.println("Enter Breadth: ");
        setBreadth(scanner.nextInt());
    }
    public  void display(){
        if(getBreadth()==getHeight()){
            System.out.println("According to given lengths it is a SQUARE.");
        }else {
            System.out.println("According to given lengths it is a RECTANGLE.");
        }
    }

}
