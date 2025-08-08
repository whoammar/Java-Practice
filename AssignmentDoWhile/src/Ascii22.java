import java.util.Scanner;

public class Ascii22 {
    public static void main(String[] args) {
       int i=1;
       int limit=140;
       char b;
        do {
            b = (char) i;
            System.out.println( " Ascii value for " + i + " is " + b );
            i++;
        }while (i<=limit);
    }

}
