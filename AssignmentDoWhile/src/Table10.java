import java.util.Scanner;

public class Table10 {
    int tableValue;
    int tableRange;
   int i =1;

   //Getter Setter
    public int getTableValue() {
        return tableValue;
    }

    public void setTableValue(int tableValue) {
        this.tableValue = tableValue;
    }

    public int getTableRange() {
        return tableRange;
    }

    public void setTableRange(int tableRange) {
        this.tableRange = tableRange;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
   //Constructor

    public Table10() {
    }
   //Core Methods
    public void takeInput(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Table value : ");
        setTableValue(scanner.nextInt());
        System.out.println("Enter the Table Range : ");
        setTableRange(scanner.nextInt());
    }
//    public void calculateTable() {
//        do {
//            int j = 1;
//            do {
//                System.out.printf("%d * %d = %d\t", j, i, j * i);
//                j++;
//            } while (j <= tableValue);
//            System.out.println("      ");
//            i++;
//        } while (i <= tableRange);
//    }

    public void calculateTable(){
        do {
            int j=1;
            do {
                System.out.printf("%d * %d =  %d\t",j,i,j * i);
                j++;
            }while (j<=tableValue);
            System.out.println("      ");
       i++; }while (i<=tableRange);
    }


    public static void main(String[]args){
        Table10 table10= new Table10();
        table10.takeInput();
        table10.calculateTable();
    }
}
