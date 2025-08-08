public class Common14 {
    public static void main(String[] args) {
      int [] array1 = {765,143,122,189,97,987};
      int [] array2 = {13,13,12,19,999,654,987,765};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println("Duplicate Found: "+ array1[i]);
                }
            }
        }
    }
}