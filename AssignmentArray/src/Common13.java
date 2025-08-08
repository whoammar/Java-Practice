public class Common13 {
    public static void main(String[]args){
        String [] array1 = {"Ammar","Aalian","Saad","Faizan","Ameen"};
        String [] array2 = {"Ameen","Ali","Saad","Kashif","Asif"};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(array2[i]) ){
                System.out.println("Duplicate Found: "+ array1[i]);
            }
        }
    }
}