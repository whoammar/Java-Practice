import java.util.Scanner;

public class ReverseString29 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input=scanner.nextLine();
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));
        }

    }
}
