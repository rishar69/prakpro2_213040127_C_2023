    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Modul7;

    /**
     *
     * @author Asus
     */
    import java.awt.event.*;
    import javax.swing.*;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.JScrollPane;

    public class FormApp extends JFrame {

        private DefaultTableModel tableModel;
        private JTable table;

        public FormApp() {
           this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Add a WindowListener to handle the close button click event
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                        FormApp.this, "Anda Yakin Ingin Keluar?", "Keluar?", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
            // Label dan kotak teks untuk input Nama
            JLabel labelNama = new JLabel("Nama:");
            labelNama.setBounds(15, 40, 150, 10);
            JTextField textFieldNama = new JTextField();
            textFieldNama.setBounds(15, 60, 350, 30);

            // Label dan kotak teks untuk input Nomor Telepon
            JLabel labelNomorTelepon = new JLabel("Nomor Telepon:");
            labelNomorTelepon.setBounds(15, 100, 150, 10);
            JTextField textFieldNomorTelepon = new JTextField();
            textFieldNomorTelepon.setBounds(15, 120, 350, 30);

            // JLabel untuk jenis kelamin
            JLabel labelKelamin = new JLabel("Jenis Kelamin:");
            labelKelamin.setBounds(15, 160, 100, 30);

            // RadioButton untuk memilih jenis kelamin
            JRadioButton radioButtonLakiLaki = new JRadioButton("Laki-Laki");
            radioButtonLakiLaki.setBounds(15, 190, 100, 30);
            JRadioButton radioButtonPerempuan = new JRadioButton("Perempuan");
            radioButtonPerempuan.setBounds(125, 190, 100, 30);

            ButtonGroup radioGroupKelamin = new ButtonGroup();
            radioGroupKelamin.add(radioButtonLakiLaki);
            radioGroupKelamin.add(radioButtonPerempuan);

            // Label dan TextArea untuk Alamat
            JLabel labelAlamat = new JLabel("Alamat:");
            labelAlamat.setBounds(15, 230, 150, 10);
            JTextArea textAreaAlamat = new JTextArea();
            textAreaAlamat.setBounds(15, 250, 350, 80);

            // Tombol untuk menyimpan data
            JButton buttonSimpan = new JButton("Simpan");
            buttonSimpan.setBounds(15, 340, 100, 40);

            // Tabel untuk menampilkan data
            String[] columnNames = {"Nama", "Jenis Kelamin", "Nomor Telepon", "Alamat"};
            tableModel = new DefaultTableModel(columnNames, 0);
            table = new JTable(tableModel);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(15, 390, 450, 150);

            // Mendengarkan klik tombol "Simpan"
            buttonSimpan.addActionListener(e -> {
                String nama = textFieldNama.getText();
                String nomorTelepon = textFieldNomorTelepon.getText();
                String jenisKelamin = radioButtonLakiLaki.isSelected() ? "Laki-Laki" : "Perempuan";
                String alamat = textAreaAlamat.getText();
                

        int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda ingin menyimpan Data ini?", "Konfirmasi Simpan", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION)
                if (nama.isEmpty() || nomorTelepon.isEmpty() || alamat.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ada field yang belum diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                } else {
                   {
            tableModel.addRow(new Object[] {nama, jenisKelamin, nomorTelepon, alamat});
            textFieldNama.setText("");
            textFieldNomorTelepon.setText("");
            radioButtonLakiLaki.setSelected(false);
            radioButtonPerempuan.setSelected(false);
            textAreaAlamat.setText("");
                }
                }
            });

            // Menambahkan komponen-komponen ke dalam frame
            this.add(buttonSimpan);
            this.add(textFieldNama);
            this.add(textFieldNomorTelepon);
            this.add(radioButtonLakiLaki);
            this.add(radioButtonPerempuan);
            this.add(labelNama);
            this.add(labelNomorTelepon);
            this.add(labelKelamin);
            this.add(labelAlamat);
            this.add(textAreaAlamat);
            this.add(scrollPane);

            // Mengatur ukuran frame
            this.setSize(500, 600);
            this.setLayout(null);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    FormApp app = new FormApp();
                    app.setVisible(true);
                }
            });
        }
    }

