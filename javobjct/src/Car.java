public class Car {
    /*
    These are the data members of the class.
     */
    String make;
    int model;
    String varient;
    String color;

    /*
    These are the member functions.
     */
void set_info(){
    make = "Tayota";
    model = 2024;
    varient = "Lexus 570";
    color = "White";
}

void get_info(){
    System.out.println("Make is " + make);
    System.out.println("Model is "+model);
    System.out.println("Varient is "+ varient);
    System.out.println("Color is "+color);
}
public static void main(String[]args){
    Car car= new Car();
    car.set_info();
    car.get_info();
}
}