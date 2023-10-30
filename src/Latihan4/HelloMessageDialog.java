
package Latihan4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloMessageDialog extends JFrame {

    public HelloMessageDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur operasi tutup jendela
        this.setLayout(new FlowLayout()); // Mengatur tata letak jendela

        JButton button = new JButton("Klik"); // Membuat tombol "Klik"
        button.setBounds(130, 100, 100, 40); // Mengatur ukuran dan posisi tombol

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo, Selamat Datang di Praktikum Pemrograman II."); // Menampilkan pesan selamat datang
            }
        });

        this.add(button); // Menambahkan tombol ke jendela
        this.setSize(200, 200); // Mengatur ukuran jendela
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloMessageDialog h = new HelloMessageDialog(); // Membuat objek HelloMessageDialog
                h.setVisible(true); // Menampilkan jendela
            }
        });
    }
}
