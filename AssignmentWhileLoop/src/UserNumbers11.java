import java.util.Scanner;

public class UserNumbers11 {
int positiveCount=0;
int negativeCount=0;
int zeroCount = 0;
boolean running = true;

public void display(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Numbers:  (or Any Character to quit. )");
  while (running){
          if (scanner.hasNextInt()){
              int value = scanner.nextInt();
              if (value<0){
                  negativeCount++;
              } else if (value>0) {
                  positiveCount++;
              } else if (value== 0) {
                  zeroCount++;
              }
          }else {
              running=false;
          }}
    System.out.println( "Zero Counts :   " +zeroCount);
    System.out.println( "Positive Number Count : " + positiveCount);
    System.out.println( "Negative Numbers Count : " +negativeCount);
}
}
