public class Expression16 {
   public static final int x = 2;
    public static final int y = 5;
    public static final int z = 0;
    boolean resultA;
    boolean resultB;
    boolean resultC;
    boolean resultD;
    boolean resultE;

public void expression(){
    boolean resultA = (x == 2);
    boolean resultB = (x != 5);
    boolean resultC = (x != 5 && y >= 5);
    boolean resultD = (z != 0 || x == 2);
    boolean resultE = (! (y < 10));
}
public void display(){
    System.out.println("a. x == 2: " + resultA);
    System.out.println("b. x != 5: " + resultB);
    System.out.println("c. x != 5 && y >= 5: " + resultC);
    System.out.println("d. z != 0 || x == 2: " + resultD);
    System.out.println("e. !(y < 10): " + resultE);
}
}
