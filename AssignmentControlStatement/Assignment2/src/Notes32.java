import java.util.Scanner;

public class Notes32 {
    int inputAmount;
    int noteCount;

    public int getInputAmount() {
        return inputAmount;
    }

    public void setInputAmount(int inputAmount) {
        this.inputAmount = inputAmount;
    }

    public int getNoteCount() {
        return noteCount;
    }

    public void setNoteCount(int noteCount) {
        this.noteCount = noteCount;
    }

    public Notes32() {
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount you want to convert: ");
        setInputAmount(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        if (inputAmount >= 5000) {
            noteCount = inputAmount / 5000;
            inputAmount = inputAmount % 5000;
            System.out.println("5000s: " + noteCount);
        } else {
            System.out.println("5000s: 0");
        }

        if (inputAmount >= 1000) {
            noteCount = inputAmount / 1000;
            inputAmount = inputAmount % 1000;
            System.out.println("1000s: " + noteCount);
        } else {
            System.out.println("1000s: 0");
        }
        if (inputAmount >= 500) {
            noteCount = inputAmount / 500;
            inputAmount = inputAmount % 500;
            System.out.println("500s: " + noteCount);
        } else {
            System.out.println("500s: 0");
        }
        if (inputAmount >= 100) {
            noteCount = inputAmount / 100;
            inputAmount = inputAmount % 100;
            System.out.println("100s: " + noteCount);
        } else {
            System.out.println("100s: 0");
        }
        if (inputAmount >= 50) {
            noteCount = inputAmount / 50;
            inputAmount = inputAmount % 50;
            System.out.println("50s: " + noteCount);
        } else {
            System.out.println("50s: 0");
        }

        if (inputAmount >= 20) {
            noteCount = inputAmount / 20;
            inputAmount = inputAmount % 20;
            System.out.println("20s: " + noteCount);
        } else {
            System.out.println("20s: 0");
        }


        if (inputAmount >= 10) {
            noteCount = inputAmount / 10;
            inputAmount = inputAmount % 10;
            System.out.println("10s: " + noteCount);
        } else {
            System.out.println("10s: 0");
        }

        if (inputAmount >= 5) {
            noteCount = inputAmount / 5;
            inputAmount = inputAmount % 5;
            System.out.println("5s: " + noteCount);
        } else {
            System.out.println("5s: 0");
        }
        if (inputAmount >= 1) {
            noteCount = inputAmount / 1;
            inputAmount = 0;
            System.out.println("1s: " + noteCount);
        } else {
            System.out.println("1s: 0");
        }
 }
}



