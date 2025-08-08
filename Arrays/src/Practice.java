import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
     int [] arrayList  = new int [5];
        for (int i = 0; i < arrayList.length; i++) {
            Scanner scanner =  new Scanner(System.in);

            arrayList[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i]);
        }

    }
}
