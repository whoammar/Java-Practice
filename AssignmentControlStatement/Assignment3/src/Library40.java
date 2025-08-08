import java.util.Scanner;

public class Library40 {
// A library charges a fine for every book returned late. For first 5 days the fine is 50
//    paisa, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you
//return the book after 30 days your membership will be canceled. Write a program
//    to accept the number of days the member is late to return the book and display the
//    fine or the appropriate message.

int dueDays;
double fine;

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public Library40() {
    }

    public int getDueDays() {
        return dueDays;
    }

    public void setDueDays(int dueDays) {
        this.dueDays = dueDays;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Due Days: ");
        setDueDays(scanner.nextInt());
        scanner.close();
    }
    public  void display(){

        if (dueDays<=5){
            fine = dueDays * 0.50;
            System.out.println("Your fine is: "+ fine);
        }  else if (dueDays>5 && dueDays <10){
            fine = dueDays;
            System.out.println("Your fine is: " + fine);
        }else if (dueDays>=10 && dueDays<=29){
            fine = dueDays * 5;
            System.out.println("Your fine is: "+ fine);
        }else if (dueDays>=30){

            System.out.println("Your Memberships is cancelled.");
        }



    }
}
