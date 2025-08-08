public class DuplicateValue11 {
    public static void main(String[]args){
       int [] array = {12,12,13,14,145,165,88,145 };
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
           if ( array[i] == array[i+1]){
               System.out.println(" Duplicate Found: " + array[i]);
           }
        }

    }
}
