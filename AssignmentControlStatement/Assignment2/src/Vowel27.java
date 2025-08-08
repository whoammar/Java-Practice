import java.util.Scanner;

public class Vowel27 {
    private char key;

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }

    public Vowel27(char key) {
        this.key = key;
    }

    public Vowel27() {
    }

public void takeInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Char to check if it is Vowel Or Consonant");
    setKey(scanner.next().charAt(0));
    scanner.close();
    }
    public void display(){
        switch (key){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println(key+ " is a Vowel.");
                break;
            default:
                System.out.println(key+ " is a consonant");
        }


    }

}
