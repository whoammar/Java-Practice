import java.util.Scanner;

public class Worker39 {
//    In a company, worker efficiency is determined on the basis of the time
//    required for a worker to complete a particular job. If the time taken by the
//    worker is between 2 – 3 hours, then the worker is said to be highly efficient. If
//    the time required by the worker is between 3 – 4 hours, then the worker is
//    ordered to improve speed. If the time taken is between 4 – 5 hours, the worker
//    is given training to improve his speed, and if the time taken by the worker is
//    more than 5 hours, then the worker has to leave the company. If the time taken
//    by the worker is input through the keyboard, find the efficiency of the worker.

    short timeTaken;

    public Worker39() {
    }

    public short getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(short timeTaken) {
        this.timeTaken = timeTaken;
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The time taken to Complete task: ");
        setTimeTaken(scanner.nextShort());
        scanner.close();
    }
    public void display(){
        if (timeTaken>=2 && timeTaken<=3){
            System.out.println("Highly Efficient");
        } else if (timeTaken>3 && timeTaken<=4) {
            System.out.println("Improve Your Speed: ");
        }else if (timeTaken>4 && timeTaken<=5){
            System.out.println("Take Training Session Regularly.");
        } else if (timeTaken>5) {
            System.out.println("You are Fired from job.");
        }
    }
}
