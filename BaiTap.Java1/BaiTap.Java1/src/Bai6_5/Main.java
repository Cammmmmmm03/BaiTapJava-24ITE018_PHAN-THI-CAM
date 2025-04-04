package Bai6_5;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.0);
        System.out.println("Initial Circle: " + c1);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());

        ResizableCircle c2 = new ResizableCircle(10.0);
        System.out.println("\nInitial ResizableCircle: " + c2);
        c2.resize(50);
        System.out.println("After resizing to 50%: " + c2);
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());
    }
}

