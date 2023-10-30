/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author Asus
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayout extends JFrame {
   
        public BorderLayout() {
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label untuk pertanyaan dan hasil
        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia?");
        JLabel labelHasil = new JLabel("Jawab pertanyaan di atas");

        // Membuat tombol-tombol untuk jawaban
        JButton buttonA = new JButton("Jakarta");
        JButton buttonB = new JButton("Bandung");
        JButton buttonC = new JButton("Surabaya");

        // Menambahkan aksi ketika tombol Jakarta diklik
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar");
            }
        });

        // Menambahkan aksi ketika tombol Bandung diklik
        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });

        // Menambahkan aksi ketika tombol Surabaya diklik
        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });

       // Menambahkan komponen-komponen ke frame dengan BorderLayout
        this.add(labelPertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.CENTER);
        this.add(buttonB, BorderLayout.EAST);
        this.add(buttonC, BorderLayout.EAST);
        // Mengatur ukuran jendela
        this.setSize(400, 200);

        
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat instance dari kelas BorderLayout
                BorderLayout layout = new BorderLayout();
                layout.setVisible(true);
            }
        });
    }
}
