public class SecondSmallest17 {
    public static void main(String[] args) {
        int[] array = {12, 33, 56, 890, 43, 27, 146, 23};

        // Bubble Sort Algorithm
        for (int i = 0; i < array.length - 1; i++) { // Outer loop for passes
            for (int j = 0; j < array.length - i - 1; j++) { // Inner loop for comparisons
                if (array[j] > array[j + 1]) { // Compare adjacent elements
                    // Swap elements if they are in the wrong order
                    int dummy = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = dummy;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

}
