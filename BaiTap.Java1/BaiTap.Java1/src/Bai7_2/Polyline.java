package Bai7_2;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Point> points;

    public Polyline() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public void removePoint(int index) {
        if (index >= 0 && index < points.size()) {
            points.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            length += points.get(i).distance(points.get(i + 1));
        }
        return length;
    }

    @Override
    public String toString() {
        return "Polyline" + points;
    }
}

