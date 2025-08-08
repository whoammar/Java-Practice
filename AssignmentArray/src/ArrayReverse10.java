public class ArrayReverse10 {
    public static void main(String[]args){
        int [] array = {123,245,354,498,576};
        int length = array.length;
        int [] reversedArray = new int[length];
        for (int i = 0; i < array.length; i++) {
            reversedArray [i] = array[length-i-1];
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }
}
