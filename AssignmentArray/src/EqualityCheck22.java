public class EqualityCheck22 {

    public static  void main(String[]args){
       int [] array1 = {12,22,33,45,67,98};
        int [] array2 = {12,22,33,45,67,98};
        boolean isEqual;
       if (array1.length==array2.length){
           isEqual = true;
           for (int i = 0; i < array1.length; i++) {
               if (array1[i] != array2[i]){
                   isEqual = false;
                   break;
               }
           }
           if (isEqual){
               System.out.println("Both Arrays are Equal.");
           }else {
               System.out.println("Arrays are Not Equal.");
           }

       }


        }
    }

