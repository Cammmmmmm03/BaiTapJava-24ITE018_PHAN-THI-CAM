package Bai4_4;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println("Point: " + p);

        MovablePoint mp = new MovablePoint(3, 4, 1, 1);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}

