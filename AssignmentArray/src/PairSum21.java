import java.util.Scanner;

public class PairSum21 {
    public static void main (String[]args){
        int [] array2 = {12,24,15,17,77};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to check if it is equal to the sum two other Numbers: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[i] + array2[j]== number){
                    System.out.println("Sum of these Two Numbers is equals to The given Number: " + array2[i] + " " + array2[j]);
                }
            }

            }
        }
    }
