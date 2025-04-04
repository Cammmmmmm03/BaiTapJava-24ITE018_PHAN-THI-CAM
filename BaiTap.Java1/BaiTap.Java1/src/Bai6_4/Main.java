package Bai6_4;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial MovablePoint: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("After moving: " + p);

        MovableCircle c = new MovableCircle(1, 1, 2, 3, 5);
        System.out.println("Initial MovableCircle: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("After moving: " + c);
    }
}

