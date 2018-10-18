package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener

{

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(t.getText().length());
    }

    JButton b;
    JTextField t;
    public Frame()
    {
        //Add behavior


        setLayout(new FlowLayout());

        b = new JButton("Button");
        t = new JTextField(10);

        add(b);add(t);
        b.addActionListener(this);
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Frame();
    }
}