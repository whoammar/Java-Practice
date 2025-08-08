public class CommonElements13 {
    public static void main(String[]args){
        String [] array1= {"Ali" ,"Ahmad","Kashif","Ibrahim","Mustafa"};
        String [] array2= {"Asif" ,"Ali","Akash","Ismail","Ibrahim"};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
              if (array1[i].equals(array2[j])){
                  System.out.println(" Duplicate Found : "+ array1[i]);
              }
            }
        }
    }
}