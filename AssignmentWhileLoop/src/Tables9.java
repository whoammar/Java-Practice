import java.util.Scanner;

public class Tables9 {
    public int getTableValue() {
        return tableValue;
    }

    public void setTableValue(int tableValue) {
        this.tableValue = tableValue;
    }

    public int getTableLength() {
        return tableLength;
    }

    public void setTableLength(int tableLength) {
        this.tableLength = tableLength;
    }

    int tableValue;
  int tableLength;
  int count = 1;
          public void takeInput(){
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter Value  of table : ");
              setTableValue(scanner.nextInt());
              System.out.println("Enter Length of Table : ");
              setTableLength(scanner.nextInt());
              scanner.close();
          }
          public void display (){
              while (count<=tableLength){
                  System.out.println(tableValue + " * " + count + " = " + tableValue*count );
                  count++;
              }
          }
}
