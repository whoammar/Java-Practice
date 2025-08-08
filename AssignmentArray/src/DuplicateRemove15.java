import java.util.Arrays;

public class DuplicateRemove15 {
    public static void main(String[] args) {
        int[] array = {13, 13, 12, 19, 999, 654, 987, 765};

        // Sorting the Array
        Arrays.sort(array); // Efficient built-in sorting

        // Removing Duplicates
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1]; // Add the last unique element

        // Create the final array with only unique elements
//        int[] result = Arrays.copyOf(temp, j);

        // Print the Final Result
        System.out.println("Array without duplicates:");
        for (int ai : temp) {
            System.out.println(ai);
        }
    }
}
