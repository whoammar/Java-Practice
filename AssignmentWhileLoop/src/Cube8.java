import java.util.Scanner;

public class Cube8 {
    int count = 1;
    int cube;
    int range;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Cube8() {
    }

    public void calCube(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        setRange(scanner.nextInt());
        while (count<=range){
            cube = count*count*count;
            System.out.println(" Cube of " + count + " is : "+ cube);
            count++;
        }

    }
}
