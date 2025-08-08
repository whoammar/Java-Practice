public class ArrayReversed {
    public static void main(String[] args) {
        int[] arrayOriginal = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] reversedArray = new int[arrayOriginal.length];

        // Fill reversedArray with elements from arrayOriginal in reverse order
        for (int i = 0; i < arrayOriginal.length; i++) {
            reversedArray[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Print the reversed array
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
