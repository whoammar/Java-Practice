import java.util.Scanner;

public class Assignment6Height {
    int height;


    //Getter Setter
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Default Constructor
    public Assignment6Height() {
    }

    public void takeInput(){
        Scanner scanner =   new Scanner(System.in);
        System.out.println("Please Enter Your Height in Centi-Meters:  ");
        setHeight(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        if(getHeight()<150){
            System.out.println( " SHORT " );
        } else if (getHeight()>=150 && getHeight()<=180) {
            System.out.println(" Average ");
            
        }else {
            System.out.println(" TALL ");
        }
    }

}
