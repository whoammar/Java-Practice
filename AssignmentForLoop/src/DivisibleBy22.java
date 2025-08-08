public class DivisibleBy22 {
    public static void main(String[] args) {
//        Write a Java program to find the number and sum of all integer between 100 and
//        200 which are divisible by 9?
        int sum=0;
        System.out.println("All these Numbers are divisible by 9: ");
        for (int i = 100; i <= 200; i++) {
            if (i%9==0){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of Numbers that are divisible by 9 : "+ sum);
    }
}
