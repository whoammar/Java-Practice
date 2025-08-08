import java.util.Scanner;

public class Assignment1 {
    //Variables
    int number1One;
    int number2Two;

    //default Constructor
    public Assignment1() {
    }

    //Getter Setter
    public int getNumber1One() {
        return number1One;
    }

    public void setNumber1One(int number1One) {
        this.number1One = number1One;
    }

    public int getNumber2Two() {
        return number2Two;
    }

    public void setNumber2Two(int number2Two) {
        this.number2Two = number2Two;
    }



    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number:");

        setNumber1One(scanner.nextInt());
        System.out.println("Enter 2nd Number:");

        setNumber2Two(scanner.nextInt());
        scanner.close();
    }
    public void display (){
        if(getNumber1One()==getNumber2Two()){
            System.out.println("Both Numbers are Equal: ");
        }else {
            System.out.println("Both Numbers are not Equal");
        }


    }

}
