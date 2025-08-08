import java.util.Scanner;

public  class DigitsInNumber14 {
    int number;
    int count =0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void takeInput(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a Number: ");
        setNumber(scanner.nextInt());
    }
    public void calculations(){
        if (number<0){
            number = -number;
        }
        if (number==0){
            count=1;
        }else {
            while (number>0){
                number = number/10;
                count++;
            }
        }
        System.out.println("The length of the entered number is: " + count);
    }
}