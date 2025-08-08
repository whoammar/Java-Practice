import java.util.Scanner;
public class OddSum4 {
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    int count = 1;
    int limit;
    int sum;
    public void OddSumCal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range : " );
        setLimit(scanner.nextInt());

        while (count<=limit ){
            if (count%2 !=0){
                System.out.println(count);
                sum = count +sum;
            }

            count++;
        }
        System.out.println(sum);
    }
}
