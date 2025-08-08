import java.util.Scanner;

public class Counts26 {
public static void main(String[] args) {
int zero=0;
int positive=0;
int negative=0;
boolean running = true;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number or Character to quit: ");
     do {
         if (!scanner.hasNextInt()){
             running=false;
         } else if (scanner.hasNextInt()) {
             int number= scanner.nextInt();
             if (number==0){
                 zero++;
             } else if (number<0) {
                 negative++;
             } else if (number>0) {
                 positive++;
             }
         }else {
             running=false;
         }
     }while (running);
    System.out.println(  "Zero Count : " + zero +   " Positive Number Count: " + positive+  " Negative Number count: "  + negative);
}}

