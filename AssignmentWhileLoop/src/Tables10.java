import java.util.Scanner;

public class Tables10 {
    int value;
    int range;
    int i=1;
    int j;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Table value: ");
        setValue(scanner.nextInt());
        System.out.println("Enter Table Range: ");
        setRange(scanner.nextInt());

    }
    public void CalTables( ){
         while (i<=range){
             int j =1;
             while (j<=value){
                 System.out.printf("%d * %d = %d\t", j, i, j * i);
                 j++;
             }
             System.out.println("      ");
             i++;
         }
    }
}