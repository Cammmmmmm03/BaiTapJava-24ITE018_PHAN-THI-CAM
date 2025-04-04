package Bai4_1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, 10, "green");
        System.out.println(cylinder);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}

