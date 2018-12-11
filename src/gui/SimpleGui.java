package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui implements ActionListener {
    private JButton button ;
    private JFrame window;
    private DrawPanel pannel;

    public static void main(String[] args) {
       new SimpleGui().run();

    }

    private  void run() {
        JFrame window = new JFrame();

       button = new JButton("Change color");
        button.addActionListener(this);

        window.getContentPane().add(BorderLayout.SOUTH, button);
        window.getContentPane().add(BorderLayout.CENTER,pannel);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(300 ,300);
        window.setVisible(true);
    }

   protected void changeText(){
        button.setText("You click me");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeText();
        changeColor();
        moveCircle ();
    }

    private void moveCircle() {
        for(int x = 0, x <= 300; x++){
            pannel.setxy(x,x);
            window.repaint();
            Thread.sleep(30);

        }
    }

    private void changeColor() {
        window.repaint();
    }
}
