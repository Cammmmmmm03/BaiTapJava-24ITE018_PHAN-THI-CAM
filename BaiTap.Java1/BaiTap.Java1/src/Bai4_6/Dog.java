package Bai4_6;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

