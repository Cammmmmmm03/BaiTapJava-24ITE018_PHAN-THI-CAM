package Bai4_6;

    public class Mammal extends Animal {
        public Mammal(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " makes a mammal sound.");
        }

        @Override
        public String toString() {
            return "Mammal[" + super.toString() + "]";
        }

}
