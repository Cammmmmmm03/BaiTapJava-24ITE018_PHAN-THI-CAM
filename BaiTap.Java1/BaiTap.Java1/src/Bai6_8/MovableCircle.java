package Bai6_8;

public class MovableCircle extends MovablePoint {
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle[center=" + super.toString() + ", radius=" + radius + "]";
    }
}

