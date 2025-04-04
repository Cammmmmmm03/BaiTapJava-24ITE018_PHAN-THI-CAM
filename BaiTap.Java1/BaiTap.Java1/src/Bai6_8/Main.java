package Bai6_8;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 2, 2);
        System.out.println("Initial Point: " + p1);
        p1.moveUp();
        System.out.println("After move up: " + p1);
        p1.moveRight();
        System.out.println("After move right: " + p1);

        MovableCircle c1 = new MovableCircle(5, 5, 3, 3, 10);
        System.out.println("\nInitial Circle: " + c1);
        c1.moveDown();
        System.out.println("After move down: " + c1);
        c1.moveLeft();
        System.out.println("After move left: " + c1);
    }
}

