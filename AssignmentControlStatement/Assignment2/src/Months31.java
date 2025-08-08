import java.util.Scanner;

public class Months31 {
    int monthInput;

    public Months31(int monthInput) {
        this.monthInput = monthInput;
    }

    public Months31() {
    }

    public int getMonthInput() {
        return monthInput;
    }

    public void setMonthInput(int monthInput) {
        this.monthInput = monthInput;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Number: ");
        setMonthInput(scanner.nextInt());
        scanner.close();
    }
    public void display(){
switch (getMonthInput()){

    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        System.out.println("31 Days");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println("30 days");
break;
    case 2:
        System.out.println("28 Days (29 Days in leap years.)");
}
    }
}
