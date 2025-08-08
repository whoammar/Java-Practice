import java.util.Scanner;

public class LastOne44 {
    public int getNumberInput() {
        return numberInput;
    }

    public void setNumberInput(int numberInput) {
        this.numberInput = numberInput;
    }

    public int getLastOneDigits() {
        return lastOneDigits;
    }

    public void setLastOneDigits(int lastOneDigits) {
        this.lastOneDigits = lastOneDigits;
    }

    public LastOne44() {
    }

    int numberInput;
    int lastOneDigits;

    public LastOne44(int numberInput, int lastOneDigits) {
        this.numberInput = numberInput;
        this.lastOneDigits = lastOneDigits;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        setNumberInput(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        lastOneDigits = numberInput % 10;
        if (lastOneDigits%3==0){
            System.out.println(lastOneDigits+" is divisible By 3");
        }else {
            System.out.println(lastOneDigits +" is not Divisible by 3");
        }
    }

}
