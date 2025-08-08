import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to encode: ");
//        int message = scanner.nextInt();
//        int EncodingKey = 200;
//        int encodedMessage = message ^ EncodingKey;
//        System.out.println("Encoded Number Stored in dataBase is: "+ encodedMessage);
//        int decodedMessage = encodedMessage^EncodingKey;
//        System.out.println("Decoded message is: "+ decodedMessage);
EncodeDecode encodeDecode = new EncodeDecode();
encodeDecode.takeInput();
encodeDecode.display();
    }
}