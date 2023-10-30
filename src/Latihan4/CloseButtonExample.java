/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Asus
 */
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CloseButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Close Button Example");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default close operation

        // Add a WindowListener to handle the close button click event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                        frame, "Do you really want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // If the user confirms, exit the application
                    System.exit(0);
                }
            }
        });

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
