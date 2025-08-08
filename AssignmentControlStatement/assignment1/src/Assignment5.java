import java.util.Scanner;

public class Assignment5 {
    int m ;
    int n = 0;

    //default Constructor
    public Assignment5() {
    }
//Getter Setter
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    //Core Member Functions
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value of M: ");
        setM(scanner.nextInt());
    }
    public void display(){
        if (m >= 1 ){
            System.out.println("Value of n is : "+ (n+1));
        } else if (m ==0) {
            System.out.println("Value of n is : " +n);
        } else {
            System.out.println( " Value of n is " +( n-1));
        }
    }
}
