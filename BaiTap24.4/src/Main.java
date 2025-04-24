

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Cúc", 85),
                new Student("Hân", 92),
                new Student("Minh", 67),
                new Student("Dũng", 78),
                new Student("Bình", 45)
        );

        Student topStudent = students.stream()
                .max(Comparator.comparingInt(s -> s.score))
                .orElse(null);
        if (topStudent != null) {
            System.out.println("1. Sinh viên có điểm cao nhất:");
            System.out.println("Tên: " + topStudent.name);
            System.out.println("Điểm: " + topStudent.score);
        }

        double avgScore = students.stream()
                .mapToInt(s -> s.score)
                .average()
                .orElse(0);
        System.out.println("\n2. Điểm trung bình của lớp: " + avgScore);

        Map<String, List<Student>> result = students.stream()
                .collect(Collectors.groupingBy(s -> s.score >= 50 ? "Pass" : "Fail"));

        System.out.println("\n3. Danh sách Pass:");
        result.getOrDefault("Pass", new ArrayList<>())
                .forEach(System.out::println);

        System.out.println("\nDanh sách Fail:");
        result.getOrDefault("Fail", new ArrayList<>())
                .forEach(System.out::println);
    }
}
