public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println(" Meow! Meow! Meow! ");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
