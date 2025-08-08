import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog("Lado",12));
        animal.add(new Dog("dolly",10));

        animal.add(new Cat("mano",3));
        animal.add(new Cat("pussy",2));

        for (Animal animal1 : animal){
            animal1.displayInfo();
            animal1.makeSound();
        }

    }
}
