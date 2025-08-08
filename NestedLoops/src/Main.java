import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int start,end,mid, length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Triangle: ");
        length = scanner.nextInt();
        start = mid = end = length/2;

        for (int row = 1; row <=length; row++) {
            for (int col = 1; col<=length ; col++) {
if (col>=start && col<=end ){
    System.out.print("*");
}else {
    System.out.print(" ");
}
            }
            if (row < mid){
                start--;
                end ++;
            }else {
                start++;
                end--;
            }
            System.out.println(" ");
        }
    }
}
