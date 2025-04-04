package Bai6_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial: " + p);

        p.moveUp();
        System.out.println("After moveUp: " + p);

        p.moveRight();
        System.out.println("After moveRight: " + p);

        p.moveDown();
        System.out.println("After moveDown: " + p);

        p.moveLeft();
        System.out.println("After moveLeft: " + p);
    }
}

