package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Withdraw extends JFrame implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==menuob.dltitm){


            dispose();
            new Delete();
        }

        if(e.getSource()==menuob.ac){

            dispose();
            new CreateAc();
        }

        if(e.getSource()==menuob.viewall){

            dispose();
            new ViewAC();
        }


        if(e.getSource()==menuob.dpitm){

            dispose();
            new Deposite();
        }

        if(e.getSource()==menuob.updtItm){

            dispose();
            new Update();
        }


        //String inf[][] =new  String[10][6];
        String temp[] = null;
        //int count=0;

        if(e.getSource()==dpadd){

            //System.out.println("success");

            InfoMap ob = new InfoMap();
            HashMap<String, ACInfo> map = new InfoMap().totalList();

            String key=null;

            if (map.containsKey(acnumber.getText())) {

                new Transaction().witdraw(dpamount.getText(),acnumber.getText(),map,ob);
            }
        }




    }

    MenuClass menuob;


    JTextField acnumber, dpamount;
    JLabel jacnumber, jdpamount;
    JButton dpadd;



    Withdraw(){

        setSize(1000,800);
        setLayout(null);

        jacnumber = new JLabel("Account NUmber");
        jacnumber.setBounds(300,300,200,20);

        acnumber= new JTextField();
        acnumber.setBounds(450,300,400,20);

        jdpamount = new JLabel("Withdraw Amount");
        jdpamount.setBounds(300,330,200,20);

        dpamount = new JTextField();
        dpamount.setBounds(450,330,400,20);


        dpadd = new JButton("Withdraw");
        dpadd.setBounds(450,360,100,20);

        dpadd.addActionListener(this);

        add(jacnumber);add(acnumber);add(jdpamount);add(dpamount);add(dpadd);


        menuob = new MenuClass(this);
        setJMenuBar(menuob.menubar());

        setVisible(true);
    }


    public static void main(String[] args) {

        new Withdraw();
    }
}