package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Delete extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {


        InfoMap ob = new InfoMap();

        HashMap<String, ACInfo> map = new InfoMap().totalList();
        String inf[][] =new  String[map.size()][6];

        Set set = map.keySet();

        Iterator<String> it = set.iterator();

        String key=jtsearch.getText();

        if(e.getSource()==serch){

            if(map.containsKey(key)){

                JOptionPane.showConfirmDialog(null,2);

                System.out.println(map.size());
                map.remove(key);
                System.out.println(map.size());
                ob.writeToFile(map);
                jtsearch.setText("");
                JOptionPane.showMessageDialog(null,"Account Delete Successful");

/*
                jtid.setText(map.get(key).id);
                jtname.setText(map.get(key).name);
                jtemail.setText(map.get(key).email);
                jtphone.setText(map.get(key).phone);
                jtopenamnt.setText(map.get(key).balance);
                jtlocation.setText(map.get(key).location);*/
/*
                jtname.setEditable(false);
                jtemail.setEditable(false);
                jtlocation.setEditable(false);
                jtphone.setEditable(false);
                jtid.setEditable(false);
                jtopenamnt.setEditable(false);
                jtsearch.setText("");*/

            }
            else{

                jtsearch.setText("");
                JOptionPane.showMessageDialog(null,"Account number not found");
            }



            /*if(e.getSource() == submit){


                jtname.setText("");
                jtemail.setText("");
                jtphone.setText("");
                jtlocation.setText("");
                jtopenamnt.setText("");
                jtid.setText("");


                map.remove(key);

                ob.writeToFile(map);


                JOptionPane.showMessageDialog(null, "A/C Delete Successful");
            }
*/

        }



        if (e.getSource()==menuob.dpitm){

           // System.out.println("aaaaaaaaaa");

            dispose();
            new Deposite();
        }
        if(e.getSource()==menuob.viewall){


            dispose();
            new ViewAC();
        }

        if(e.getSource()==menuob.wditm){

            dispose();
            new Withdraw();
        }

        if(e.getSource()==menuob.ac){

            dispose();
            new CreateAc();
        }



    }

    JLabel  id, name,  email, phone, location, openamnt;
    JTextField jtname, jtemail, jtphone, jtlocation, jtopenamnt, jtid, jtsearch;


    JButton submit,serch;


    MenuClass menuob;

    Delete(){
        setSize(1000,800);
        this.setLayout(null);



        jtsearch = new JTextField();
        jtsearch.setBounds(300,300, 150,20);
        serch = new JButton("Delete A/C");
        serch.setBounds(450,300,150,20);

        serch.addActionListener(this);



        add(serch);
        add(jtsearch);


        menuob =new MenuClass(this);
        setJMenuBar(menuob.menubar());
        //setJMenuBar(menubar());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {


        new Delete();
    }


}