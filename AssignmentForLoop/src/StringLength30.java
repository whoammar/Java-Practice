import java.util.Scanner;

public class StringLength30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = scanner.nextLine();
        int count=0;
        for (int i = 0; ;i++) {
          try {
              input.charAt(i);
              count++;
          }catch (Exception ex){
              break;
          }
        }
        System.out.println("String Digits Count is : " + count);
    }
}
