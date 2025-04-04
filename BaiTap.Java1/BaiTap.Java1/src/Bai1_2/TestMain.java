package Bai1_2;

public class TestMain{
    public static void main(String[] args) {

        Circle c1= new Circle(1.1);
        System.out.println(c1);
        Circle c2= new Circle();
        System.out.println(c2);

        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is:"+ c1.getRadius());
        System.out.println("are is:"+ c1.getArea());
        System.out.println("circrmference is:"+ c1.getCircumference());
    }
}