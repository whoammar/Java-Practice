import java.util.Scanner;

public class AlphabetCheck {
    char inputChar;
    int convertedChar;


    //Default Constructor
    public AlphabetCheck() {
    }

    //Getter Setter
    public char getInputChar() {
        return inputChar;
    }

    public void setInputChar(char inputChar) {
        this.inputChar = inputChar;
    }

    public int getConvertedChar() {
        return convertedChar;
    }

    public void setConvertedChar(int convertedChar) {
        this.convertedChar = convertedChar;
    }
    public  void takeinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        setInputChar(scanner.next().charAt(0));
        scanner.close();
    }
    public void display(){
       setConvertedChar(   (int) getInputChar()   );
   if(getConvertedChar()>=65 && getConvertedChar() <=90){
            System.out.println("Upper Case ");
        }else if (getConvertedChar()>=97 && getConvertedChar() <=122){
            System.out.println("Lower Case");
        }

   else {
       System.out.println("Invalid Input..");
   }
    }


}
