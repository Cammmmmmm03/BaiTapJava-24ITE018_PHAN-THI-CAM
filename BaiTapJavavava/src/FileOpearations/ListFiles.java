package FileOpearations;

import java.io.*;

public class ListFiles {
    public static void main(String[] args) {
        File directory = new File(".");
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Danh sách file trong thư mục:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}

