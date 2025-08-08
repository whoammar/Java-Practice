import java.util.Scanner;

public class Last27 {
    public static void main(String[] args) {
       int number;
       boolean running=true;
       int smallest=0;
       int largest =0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a Number: (character to quit.) ");
        number=scanner.nextInt();
       do {
           if (scanner.hasNextInt()){
               number=scanner.nextInt();

               if (number>largest){
                   largest=number;
               } else if (number<smallest) {
                   smallest=number;
               }
           }else {
               running =false;
           }
       }while (running);
        System.out.println("Smallest Number is : " + smallest + " Largest Number is: " + largest);
    }
}
