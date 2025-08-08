import java.util.Scanner;

public class EvenOdd {
    int checkEvenOdd;

    //Getter Setter
    public int getCheckEvenOdd() {
        return checkEvenOdd;
    }

    public void setCheckEvenOdd(int checkEvenOdd) {
        this.checkEvenOdd = checkEvenOdd;
    }


//Default Constructor
    public EvenOdd() {
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter An Integer Value \n whether it is Even or Odd ");
        setCheckEvenOdd(scanner.nextInt());
    }
    public void display(){
       if (getCheckEvenOdd()%2 ==0){
           System.out.println("The Entered Number is Even.");
       }
       else {
           System.out.println("The Entered number is odd");
       }
    }
}
