package Bai4_6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        Animal dog = new Dog("Buddy");

        System.out.println(cat);
        cat.makeSound();

        System.out.println(dog);
        dog.makeSound();
    }
}

