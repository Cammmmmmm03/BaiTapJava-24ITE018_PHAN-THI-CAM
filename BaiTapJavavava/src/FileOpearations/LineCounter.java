package FileOpearations;

import java.io.*;

public class LineCounter {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Số dòng trong file: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
