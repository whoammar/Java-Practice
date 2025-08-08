import java.util.Scanner;

public class Temperature23 {
    float inputTemperature;

    //Default Constructor
    public Temperature23() {
    }

    //Parameterized Constructor
    public Temperature23(float inputTemperature) {
        this.inputTemperature = inputTemperature;
    }

    //Getter Setter
    public float getInputTemperature() {
        return inputTemperature;
    }

    public void setInputTemperature(float inputTemperature) {
        this.inputTemperature = inputTemperature;
    }

    //Core Methods
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        setInputTemperature(scanner.nextFloat());
        scanner.close();
    }

    public void display(){
        if (getInputTemperature()<0){
            System.out.println("Freezing Cold");
        } else if (getInputTemperature()>= 0 && getInputTemperature() <10) {
            System.out.println("Very cold");
        } else if (getInputTemperature()>= 10 && getInputTemperature() <20) {
            System.out.println("Cold Weather");
        } else if (getInputTemperature()>= 20 && getInputTemperature() <30) {
            System.out.println("Normal weather");
        } else if (getInputTemperature()>= 30 && getInputTemperature() <40) {
            System.out.println("Hot Weather");
        }else {
            System.out.println("Very High Temperature");
        }
    }
}
