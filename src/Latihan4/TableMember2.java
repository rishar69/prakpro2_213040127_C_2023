import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TableMember2 extends JFrame {

    private boolean checkBoxSelected;
    private DefaultTableModel tableModel;
    private JTable table;

    public TableMember2() {
        // Inisialisasi JFrame
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label untuk input Nama
        JLabel labelInput = new JLabel("Nama:");
        labelInput.setBounds(15, 40, 150, 10);

        // Kotak teks untuk memasukkan nama
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Label "Jenis Member"
        JLabel labelRadio = new JLabel("Jenis Member:");
        labelRadio.setBounds(15, 100, 150, 10);

        // RadioButton untuk memilih jenis member
        JRadioButton radioButtonSilver = new JRadioButton("Silver");
        radioButtonSilver.setBounds(15, 120, 100, 30);

        JRadioButton radioButtonGold = new JRadioButton("Gold");
        radioButtonGold.setBounds(125, 120, 100, 30);

        JRadioButton radioButtonPlatinum = new JRadioButton("Platinum");
        radioButtonPlatinum.setBounds(235, 120, 100, 30);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButtonSilver);
        radioGroup.add(radioButtonGold);
        radioGroup.add(radioButtonPlatinum);

        // Tombol untuk menyimpan data
        JButton button = new JButton("Simpan");
        button.setBounds(15, 160, 100, 40);

        // Tabel untuk menampilkan data
        String[] columnNames = {"Nama", "Jenis Member"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15, 200, 350, 150);

        // Area teks untuk menampilkan output
        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 360, 350, 80);

        // Mendengarkan perubahan status checkbox
        radioButtonSilver.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });

        radioButtonGold.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });

        radioButtonPlatinum.addItemListener(e -> {
            checkBoxSelected = e.getStateChange() == 1;
        });

        // Mendengarkan klik tombol "Simpan"
        button.addActionListener(e -> {
            if (checkBoxSelected) {
                String nama = textField.getText();
                String jenisMember = "";
                if (radioButtonSilver.isSelected()) {
                    jenisMember = radioButtonSilver.getText();
                } else if (radioButtonGold.isSelected()) {
                    jenisMember = radioButtonGold.getText();
                } else if (radioButtonPlatinum.isSelected()) {
                    jenisMember = radioButtonPlatinum.getText();
                }

                tableModel.addRow(new Object[] {nama, jenisMember});
                textField.setText("");
                radioButtonSilver.setSelected(false);
                radioButtonGold.setSelected(false);
                radioButtonPlatinum.setSelected(false);
            } else {
                txtOutput.setText("Anda harus memilih jenis member.");
            }
        });

        // Menambahkan komponen-komponen ke dalam frame
        this.add(button);
        this.add(textField);
        this.add(radioButtonSilver);
        this.add(radioButtonGold);
        this.add(radioButtonPlatinum);
        this.add(labelInput);
        this.add(labelRadio);
        this.add(scrollPane);
        this.add(txtOutput);

        // Mengatur ukuran frame
        this.setSize(400, 500);
        this.setLayout(null);
    }

    // Fungsi utama yang akan dijalankan saat aplikasi dimulai
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TableMember2 h = new TableMember2();
                h.setVisible(true);
            }
        });
    }
}
