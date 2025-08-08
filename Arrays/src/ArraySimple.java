public class ArraySimple {
 public static void main(String[]args){
             int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} ,{8, 9,10} };
        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("list ["+row+"]["+col+"] = " +myNumbers[row][col]);
            }
        }
 }
}
