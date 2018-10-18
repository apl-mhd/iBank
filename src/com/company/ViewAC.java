package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ViewAC extends JFrame implements ActionListener {

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
        if (e.getSource()==menuob.dpitm){

            dispose();
            new Deposite();
        }

        if(e.getSource()==menuob.wditm){

            dispose();
            new Withdraw();
        }
        if(e.getSource()==menuob.updtItm){

            dispose();
            new Update();
        }







    }

    MenuClass menuob;

    ViewAC(){

        InfoMap ob = new InfoMap();

        HashMap<String, ACInfo> map = new InfoMap().totalList();
        String inf[][] =new  String[map.size()][6];

        Set set = map.keySet();

        Iterator<String> it = set.iterator();

        String key=null;

        int count=0;
        while (it.hasNext()){
            key = it.next();

            inf[count][0]= map.get(key).id;
            inf[count][1]= map.get(key).name;
            inf[count][2]= map.get(key).email;
            inf[count][3]= map.get(key).phone;
            inf[count][4]= map.get(key).balance;
            inf[count][5]= map.get(key).location;

            count++;

        }



       // String temp[] = null;



        String column[]={"Id","Name","Email","Phone","Balance", "Location" };
        JTable jt=new JTable(inf,column);
        jt.setBounds(30,40,1000,800);
        JScrollPane sp=new JScrollPane(jt);
        add(sp);
        setSize(1000,800);

        menuob = new MenuClass(this);
        setJMenuBar(menuob.menubar());

        // menuob.newAC.addActionListener(this);

        setVisible(true);

    }

    public static void main(String[] args) {

        new ViewAC();
    }
}