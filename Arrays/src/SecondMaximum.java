import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {
        int maximum=0;
        int secondMaximum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int length = scanner.nextInt();
        int [] list = new int [length];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the "+ i + " element of list" );
            list [i] = scanner.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            maximum = list[0];
            secondMaximum = list[0];
            if (list[i]>maximum){
                maximum = list[i];
            }
            if (list[i]<maximum && list[i]>secondMaximum){
                secondMaximum = list[i];
            }


        }
        System.out.println("Maximum Number is : " + maximum);
        System.out.println(secondMaximum);

    }
}
