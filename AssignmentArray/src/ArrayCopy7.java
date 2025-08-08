public class ArrayCopy7 {
    public static void main(String[]args){
        int [] arrayOriginal = {78,87,56,42,32,91};
        int [] arrayCopy = new int[arrayOriginal.length];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayCopy[i] = arrayOriginal[i];
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i] + " ");
        }
    }
}