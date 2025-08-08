import java.util.Scanner;

public class VoteCastingAge {

    int ageVoter;
    public static final int AGE_CASTING_VOTE= 18;

    //Getter Setter
    public int getAgeVoter() {
        return ageVoter;
    }

    public void setAgeVoter(int ageVoter) {
        this.ageVoter = ageVoter;
    }

// default Constructor

    public VoteCastingAge() {
    }
    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        setAgeVoter(scanner.nextInt());
    }
    public void display(){
        if (getAgeVoter() >= AGE_CASTING_VOTE){
            System.out.println("You can Cast Your Vote..! ");
        }
        else {
            System.out.println("oops..! Sorry You cannot Cast your Vote");
        }
    }
}
