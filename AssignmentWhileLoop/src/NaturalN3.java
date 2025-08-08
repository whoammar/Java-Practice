import java.util.Scanner;

public class NaturalN3 {
    int count = 1;
    int limit;
    int sum = 0;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void naturalSum(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of Natural Numbers: ");
        setLimit(scanner.nextInt());

    while (count<= getLimit()){
        System.out.println(count);
        sum = count+sum;
        count++;
    }
        System.out.println("Total sum of All Natural Numbers is : "+ sum);
}
}
