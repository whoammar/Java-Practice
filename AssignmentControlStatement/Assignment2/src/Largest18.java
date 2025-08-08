public class Largest18 {
    public static final int inputOne=120938;
    public static final int inputTwo= 5894;
    public static final int inputThree = 52244562;

//Default Constructor
    public Largest18() {
    }
    public void display(){
   int largest;

   largest = inputOne;
   if (inputTwo>largest){
       largest = inputTwo;
   }
   if (inputThree>largest){
       largest = inputThree;
   }
        System.out.println("largest Input is : "+ largest);


    }

}
