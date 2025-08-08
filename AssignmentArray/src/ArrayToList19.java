import java.util.ArrayList;

public class ArrayToList19 {
    public static void main(String[]args){
        int [] array ={12,22,32,42,52,62,72};
        ArrayList<Integer> rollNo = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
             rollNo.add(array[i]);
        }
        System.out.println(rollNo.get(4));
    }
}