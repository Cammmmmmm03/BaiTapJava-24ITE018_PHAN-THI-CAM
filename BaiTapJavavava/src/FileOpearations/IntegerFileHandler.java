package FileOpearations;

import java.io.*;
import java.util.*;

public class IntegerFileHandler {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        writeIntegersToFile("numbers.dat", numbers);
        List<Integer> readNumbers = readIntegersFromFile("numbers.dat");
        System.out.println("Số nguyên đọc từ file: " + readNumbers);
    }

    public static void writeIntegersToFile(String filename, List<Integer> numbers) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int num : numbers) {
                dos.writeInt(num);
            }
            System.out.println("Ghi danh sách số nguyên vào file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> readIntegersFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {
                numbers.add(dis.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
