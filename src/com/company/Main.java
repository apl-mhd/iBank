package com.company;

import javax.swing.*;


public class Main
{
    public static void main(String[] args)
    {
        JFrame jFrame = new LoginScreen("IBank Management System");

        //jFrame.setSize(500,300);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}