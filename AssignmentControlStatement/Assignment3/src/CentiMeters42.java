import java.util.Scanner;

public class CentiMeters42 {
    public double getCentiMeters() {
        return centiMeters;
    }

    public void setCentiMeters(double centiMeters) {
        this.centiMeters = centiMeters;
    }

    public CentiMeters42() {
    }

    double centiMeters;

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getKiloMeters() {
        return kiloMeters;
    }

    public void setKiloMeters(double kiloMeters) {
        this.kiloMeters = kiloMeters;
    }

    double meters;
    double kiloMeters;
    public void takeInput(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter Centimeters: ");
        setCentiMeters(scanner.nextInt());
        scanner.close();
    }
    public void display(){
        meters = centiMeters/100;
        kiloMeters = centiMeters/100000;
        System.out.println(centiMeters + " Centimeters are "+ meters + " Meters");
        System.out.println(centiMeters + " Centimeters are "+ kiloMeters + " KiloMeters");
    }
}
