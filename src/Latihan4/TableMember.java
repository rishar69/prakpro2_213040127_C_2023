package Latihan4;

import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

public class TableMember extends JFrame {

    private boolean checkBoxSelected;

    public TableMember() {
        // Inisialisasi JFrame
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label untuk input Nama
        JLabel labelInput = new JLabel("Nama");
        labelInput.setBounds(15, 40, 150, 10);

        // Kotak teks untuk memasukkan nama
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Checkbox untuk memilih jenis member
        JCheckBox checkBox = new JCheckBox("Silver");
        checkBox.setBounds(15, 100, 350, 30);
        
        JCheckBox checkBox1 = new JCheckBox("Gold");
        checkBox.setBounds(15, 100, 350, 30);
        
        JCheckBox checkBox2 = new JCheckBox("Silver");
        checkBox.setBounds(15, 100, 350, 30);

        // Tombol untuk menyimpan data
        JButton button = new JButton("Simpan");
        button.setBounds(15, 150, 100, 40);

        // Area teks untuk menampilkan output
        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 200, 350, 100);

        // Mendengarkan perubahan status checkbox
        checkBox.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });
        
        checkBox1.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });
        
        checkBox2.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });

        // Mendengarkan klik tombol "Simpan"
        button.addActionListener(e -> {
            if (checkBoxSelected) {
                String nama = textField.getText();
                txtOutput.append("Hello " + nama + "\n");
                textField.setText("");
            } else {
                txtOutput.append("Anda Harus Memilih Member\n");
            }
        });

        // Menambahkan komponen-komponen ke dalam frame
        this.add(button);
        this.add(textField);
        this.add(checkBox);
        this.add(checkBox1);
        this.add(checkBox2);
        this.add(labelInput);
        this.add(txtOutput);

        // Mengatur ukuran frame
        this.setSize(400, 550);
        this.setLayout(null);
    }

    // Fungsi utama yang akan dijalankan saat aplikasi dimulai
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TableMember h = new TableMember();
                h.setVisible(true);
            }
        });
    }
}
