public class Duplicate12 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "grape"};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].equals( array[i+1])){
                System.out.println("Duplicate Found: " + array[i]);
            }
        }
    }
}