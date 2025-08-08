public class Ascii25 {

    public static void main(String[]args){
        int i=0;
        char Ascii;
        while (i <=127){
           Ascii = (char) i;
            System.out.println("Ascii code for " + i + " is " + Ascii);
            i++;
        }
    }
}
