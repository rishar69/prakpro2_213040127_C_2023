package Latihan1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CheckBox extends JFrame {

    private boolean checkBoxSelected;

    public CheckBox() {
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label untuk input Nama
        JLabel labelInput = new JLabel("Input Nama");
        labelInput.setBounds(15, 40, 150, 10);

        // Kotak teks untuk memasukkan nama
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Checkbox untuk menyetujui ketentuan yang berlaku
        JCheckBox checkBox = new JCheckBox("Saya Menyetujui ketentuan yang berlaku");
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

        // Mendengarkan klik tombol "Simpan"
        button.addActionListener(e -> {
            if (checkBoxSelected) {
                String nama = textField.getText();
                txtOutput.append("Hello " + nama + "\n");
                textField.setText("");
            } else {
                txtOutput.append("Anda Belum menyetujui ketentuan yang berlaku\n");
            }
        });

        // Menambahkan komponen-komponen ke dalam frame
        this.add(button);
        this.add(textField);
        this.add(checkBox);
        this.add(labelInput);
        this.add(txtOutput);

        // Mengatur ukuran frame
        this.setSize(400, 350);
        this.setLayout(null);
    }

   public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater (new Runnable() { 
            public void run() { 
                CheckBox h = new CheckBox
        ();
                h.setVisible(true);
            }
        });
    }

}