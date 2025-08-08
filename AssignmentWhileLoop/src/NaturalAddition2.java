public class NaturalAddition2 {
    int count =1;
    int limit = 10;
    int sum = 0;
    public void naturalSum(){
        while (count<=limit){
          sum = count+sum;
            count++;
        }
        System.out.println(sum);
    }
}
