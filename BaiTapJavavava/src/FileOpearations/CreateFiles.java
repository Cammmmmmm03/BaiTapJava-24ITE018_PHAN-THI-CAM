package FileOpearations;

import java.io.*;

public class CreateFiles {
    public static void main(String[] args) {
        createFile("input.txt", "Dòng 1: Xin chào\nDòng 2: Đây là file input\nDòng 3: Chương trình Java đang chạy");
        createFile("output.txt", "");
    }

    public static void createFile(String filename, String content) {
        try {
            File file = new File(filename);
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(content);
                }
                System.out.println(filename + " đã được tạo.");
            } else {
                System.out.println(filename + " đã tồn tại.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



