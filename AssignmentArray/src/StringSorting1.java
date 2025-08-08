public class StringSorting1 {
    public static void main(String[] args) {
        // Example string array
        String[] names = {"Zara", "Zain", "Jlice", "Bob", "John"};

        // Sorting using Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (String name : names) {
            System.out.print(name + " ");
        }

    }
}


