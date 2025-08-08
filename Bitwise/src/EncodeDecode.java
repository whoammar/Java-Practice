import java.util.Scanner;

public class EncodeDecode {
   static final int encodingKey =200;
    int message;
    int decodedMessage;
    int encodedMessage;
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Message to Encode: ");
        message = scanner.nextInt();
        encodedMessage = message ^ encodingKey;
        decodedMessage = encodedMessage ^ encodingKey;
        scanner.close();
    }
    public void display(){
        System.out.println("Encoded message:  "+ encodedMessage);
        System.out.println("Decoded message: " + decodedMessage);
    }
}
