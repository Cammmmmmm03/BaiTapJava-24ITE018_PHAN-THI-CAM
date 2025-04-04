package Bai6_6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets();

        Dog dog1 = new Dog("Buddy");
        dog1.greets();

        Dog dog2 = new Dog("Charlie");
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("Rex");
        bigDog1.greets();

        BigDog bigDog2 = new BigDog("Bruno");
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog2);
    }
}

