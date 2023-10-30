
package Latihan4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloInputDialog extends JFrame {
    
    public HelloInputDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur operasi tutup window
        this.setLayout(new FlowLayout()); // Mengatur tata letak window

        JButton button = new JButton("Input"); // Membuat tombol "Input"
        button.setBounds(130, 100, 100, 40); // Mengatur ukuran dan posisi tombol

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog(HelloInputDialog.this, "Inputkan nama anda"); // Menampilkan dialog input
                JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello, " + nama); // Menampilkan pesan dengan input pengguna
            }
        });

        this.add(button); // Menambahkan tombol ke window
        this.setSize(200, 200); // Mengatur ukuran window
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInputDialog h = new HelloInputDialog(); // Membuat objek HelloInputDialog
                h.setVisible(true); // Menampilkan window
            }
        });
    }
}
