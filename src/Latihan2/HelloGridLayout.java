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

public abstract class HelloGridLayout extends JFrame implements ActionListener {
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;
    private JButton[] buttons;
    private boolean gameOver;

    public HelloGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameOver = false;

        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");
        
        buttons = new JButton [9];
        buttons[1] = buttonA ;
        buttons[2] = buttonB;
        buttons[3] = buttonC;
        buttons[4] = buttonD;
        buttons[5] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);
        
        
        this.setLayout(new GridLayout(3,3));
        
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);
        
        this.setSize(300,300);
    } 
    public void actionPerformed(ActionEvent e) {
    if (!gameOver) 
    {
        JButton button = (JButton) e.getSource();
        if (button.getText().isEmpty()) 
        {
            button.setText("0");
            if (!gameOver) 
            {
                boolean isXSet = false;
                for (int i = 0; i < buttons.length; i++) 
                {
                    if (buttons[i].getText().isEmpty())
                    {
                        buttons[i].setText("X");
                        break; // Set one "X" and exit the loop
                    }
                }
                checkwinner(); 
            }
        }
    }            
    }
    private void checkwinner()
    {
String winner = "";
if (!buttonA.getText().isEmpty() 
     && buttonA.getText().equals (buttonB.getText())
     && buttonA.getText().equals (buttonC.getText()))
{
    winner =  buttonA.getText();
    buttonA.setForeground (Color.RED);
    buttonB.setForeground (Color.RED);
    buttonC.setForeground (Color.RED);
    }else if (!buttonD.getText().isEmpty()
        && buttonD.getText().equals(buttonE.getText()) 
        && buttonD.getText().equals (buttonF.getText()))
 {
     winner = buttonD.getText();
    buttonD.setForeground (Color.RED); 
    buttonE.setForeground (Color.RED);
    buttonF.setForeground (Color.RED);
}else if (!buttonG.getText().isEmpty() 
        && buttonG.getText().equals(buttonH.getText())
        && buttonG.getText().equals(buttonI.getText()))
{
    winner = buttonG.getText();
    buttonG.setForeground (Color.RED); 
    buttonH.setForeground (Color.RED);
    buttonI.setForeground (Color.RED);         
}else if(!buttonA.getText().isEmpty()
           && buttonA.getText().equals(buttonD.getText())
           && buttonA.getText().equals(buttonG.getText()))
{
    winner = buttonA.getText();
    buttonA.setForeground (Color.RED); 
    buttonD.setForeground (Color.RED);
    buttonG.setForeground (Color.RED);         
}else if(!buttonA.getText().isEmpty()
           && buttonA.getText().equals(buttonE.getText())
           && buttonA.getText().equals(buttonH.getText()))
{
      winner = buttonB.getText();
    buttonB.setForeground (Color.RED); 
    buttonE.setForeground (Color.RED);
    buttonH.setForeground (Color.RED);         
}else if(!buttonC.getText().isEmpty()
           && buttonC.getText().equals(buttonF.getText())
           && buttonC.getText().equals(buttonI.getText()))
{
       winner = buttonC.getText();
    buttonC.setForeground (Color.RED); 
    buttonF.setForeground (Color.RED);
    buttonI.setForeground (Color.RED);         
}else if(!buttonA.getText().isEmpty()
           && buttonA.getText().equals(buttonE.getText())
           && buttonA.getText().equals(buttonI.getText()))
{
       winner = buttonA.getText();
    buttonA.setForeground (Color.RED); 
    buttonE.setForeground (Color.RED);
    buttonI.setForeground (Color.RED);         
}else if(!buttonC.getText().isEmpty()
           && buttonC.getText().equals(buttonE.getText())
           && buttonC.getText().equals(buttonG.getText()))
{
       winner = buttonC.getText();
    buttonC.setForeground (Color.RED); 
    buttonE.setForeground (Color.RED);
    buttonG.setForeground (Color.RED);         
}
gameOver = !winner.isEmpty();
    }
    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() { 
        public void run() {
            HelloGridLayout h= new HelloGridLayout() {};
            h.setVisible(true);
            }
         });
    }
}