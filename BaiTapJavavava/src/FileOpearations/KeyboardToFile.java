package FileOpearations;

import java.io.*;

public class KeyboardToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("userInput.txt")) {
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }
            System.out.println("Dữ liệu đã được lưu vào userInput.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
