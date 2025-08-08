public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println(" Woof! Woof! Woof! ");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
