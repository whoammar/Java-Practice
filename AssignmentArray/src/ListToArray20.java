import java.util.ArrayList;

public class ListToArray20 {
    public static void main(String[]args){

        ArrayList<Integer> rollNo = new ArrayList<Integer>();
        rollNo.add(12);
        rollNo.add(22);
        rollNo.add(32);
        rollNo.add(42);
        rollNo.add(52);
        rollNo.add(62);
       int size = rollNo.size();
       int [] array =new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = rollNo.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
