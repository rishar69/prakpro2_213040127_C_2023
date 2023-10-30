/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;


import java.awt.event.*;
import javax.swing.*;

public class HelloScrollPane extends JFrame {
    
    public HelloScrollPane(){
        
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        // Fungsi ini menginisialisasi komponen-komponen GUI seperti label, text field, dan tombol.
        JLabel labelInput = new JLabel("Input Nama:"); 
        labelInput.setBounds (130,40,100,10);
       
        JTextField textField = new JTextField(); 
        textField.setBounds (130,60,100,30);
        JButton button = new JButton("Klik"); 
        button.setBounds (130,100,108, 40);
        
        // Fungsi ini menginisialisasi komponen untuk output teks dengan adanya JScrollPane.
        JTextArea txtOutput = new JTextArea("");
        JScrollPane scrollableTextArea = new JScrollPane(txtOutput); 
        
        scrollableTextArea.setBounds(130, 150, 100, 100);
        scrollableTextArea.setHorizontalScrollBarPolicy (JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        scrollableTextArea.setVerticalScrollBarPolicy (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Fungsi ini menambahkan event listener ke tombol "Klik" untuk menampilkan pesan.
        button.addActionListener(new ActionListener(){ 
            public void actionPerformed (ActionEvent e) { 
                String nama = textField.getText();
                txtOutput.append("Hello "+nama+"\n"); 
                textField.setText("");
            }
        });
        
        // Fungsi ini menambahkan komponen-komponen ke frame utama.
        this.add(button);
        this.add(textField);
        this.add(labelInput); 
        this.add(scrollableTextArea);
        
        this.setSize(400, 500);
        this.setLayout(null);
    }
    
    // Fungsi utama yang akan dijalankan saat aplikasi dimulai.
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater (new Runnable() { 
            public void run() { 
                HelloScrollPane h = new HelloScrollPane();
                h.setVisible(true);
            }
        });
    }

}
