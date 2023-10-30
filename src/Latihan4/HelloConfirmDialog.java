
package Latihan4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloConfirmDialog extends JFrame {
    public HelloConfirmDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur operasi tutup jendela
        this.setLayout(new FlowLayout()); // Mengatur tata letak jendela

        JButton button = new JButton("Exit"); // Membuat tombol "Exit"
        button.setBounds(130, 100, 100, 40); // Mengatur ukuran dan posisi tombol

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this, "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION); // Menampilkan dialog konfirmasi
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0); // Keluar dari aplikasi jika pengguna memilih "Ya"
                } else {
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tombol NO"); // Menampilkan pesan jika pengguna memilih "Tidak"
                }
            }
        });

        this.add(button); // Menambahkan tombol ke jendela
        this.setSize(200, 200); // Mengatur ukuran jendela
    }

    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog h = new HelloConfirmDialog(); // Membuat objek HelloConfirmDialog
                h.setVisible(true); // Menampilkan jendela
            }
        });
    }
}
