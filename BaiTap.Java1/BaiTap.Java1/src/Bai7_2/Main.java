package Bai7_2;

public class Main {
    public static void main(String[] args) {
        Polyline polyline = new Polyline();

        polyline.addPoint(new Point(1, 1));
        polyline.addPoint(new Point(4, 5));
        polyline.addPoint(new Point(7, 9));

        System.out.println("Polyline: " + polyline);
        System.out.println("Total Length: " + polyline.getLength());

        polyline.removePoint(1);
        System.out.println("After removing point at index 1: " + polyline);
        System.out.println("Updated Length: " + polyline.getLength());
    }
}

