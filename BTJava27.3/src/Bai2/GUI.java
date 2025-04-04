package Bai2;

import Bai1.Delete;
import Bai1.Read;
import Bai1.Write;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI{

    public static void main(String[] args) {
        JFrame frame = new JFrame("XML Student Manager");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btnRead = new JButton("Đọc fie XML");
        btnRead.setBounds(120,50, 150, 30);
        frame.add(btnRead);

        JButton btnWrite = new JButton("thêm sinh viên");
        btnWrite.setBounds(120,100, 150, 30);
        frame.add(btnWrite);

        JButton btnDelete = new JButton("xóa sinh viên");
        btnDelete.setBounds(120,100, 150, 30);
        frame.add(btnDelete);

        btnRead.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Read.main(null);
            }
        });

        btnWrite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Write.main(null);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Delete.main(null);
            }
        });
        frame.setVisible(true);
    }
}
