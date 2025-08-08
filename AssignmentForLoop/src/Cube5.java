import java.util.Scanner;

public class Cube5 {
    public static void main(String[] args) {
      int limit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        limit=scanner.nextInt();
        for (int i =1;i <limit;i++){
            int cube =(int) Math.pow(i,3);
            System.out.println(" Cube of number " + i + " : " + cube);

        }
    }
}
