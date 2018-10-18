package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Update extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {


        InfoMap ob = new InfoMap();

        HashMap<String, ACInfo> map = new InfoMap().totalList();
        String inf[][] =new  String[map.size()][6];

        Set set = map.keySet();

        Iterator<String> it = set.iterator();
        String key=jtsearch.getText();


        if(e.getSource()==menuob.dltitm){


            dispose();
            new Delete();
        }

        if(e.getSource()==serch){

            if(map.containsKey(key)){


                jtid.setText(map.get(key).id);
                jtname.setText(map.get(key).name);
                jtemail.setText(map.get(key).email);
                jtphone.setText(map.get(key).phone);
                jtopenamnt.setText(map.get(key).balance);
                jtlocation.setText(map.get(key).location);

                jtid.setEditable(false);
                jtopenamnt.setEditable(false);
                jtsearch.setText("");

            }
            else{

                jtsearch.setText("");
                JOptionPane.showMessageDialog(null,"Account number not found");
            }


        }



        if (e.getSource()==menuob.dpitm){

            //System.out.println("aaaaaaaaaa");

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


        if(e.getSource() == submit){

            ACInfo acob = map.get(key);

            acob.name =jtname.getText();
            acob.email = jtemail.getText();
            acob.phone = jtphone.getText();
            acob.location = jtlocation.getText();

            map.put(key, acob);



            jtname.setText("");
            jtemail.setText("");
            jtphone.setText("");
            jtlocation.setText("");
            jtopenamnt.setText("");
            jtid.setText("");

            ob.writeToFile(map);


            JOptionPane.showMessageDialog(null, "A/C update successful");
        }

    }

    JLabel  id, name,  email, phone, location, openamnt;
    JTextField jtname, jtemail, jtphone, jtlocation, jtopenamnt, jtid, jtsearch;


    JButton submit,serch;


    MenuClass menuob;

    Update(){
        setSize(1000,800);
        this.setLayout(null);



        jtsearch = new JTextField();
        jtsearch.setBounds(300,5, 150,20);
        serch = new JButton("Search A/C");
        serch.setBounds(450,5,150,20);

        serch.addActionListener(this);

        name = new JLabel("Name :");
        name.setBounds(100,30,200,20);
        jtname = new JTextField();
        jtname.setBounds(250, 30, 400, 20);

        email = new JLabel("Email :");
        email.setBounds(100,60,200,20);
        jtemail = new JTextField();
        jtemail.setBounds(250, 60, 400, 20);

        phone = new JLabel("Phone :");
        phone.setBounds(100,90,200,20);
        jtphone = new JTextField();
        jtphone.setBounds(250, 90, 400,20);

        location = new JLabel("Location :");
        location.setBounds(100,120,200,20);
        jtlocation = new JTextField();
        jtlocation.setBounds(250, 120, 400,20);

        openamnt = new JLabel("Balance :");
        openamnt.setBounds(100,150,200,20);
        jtopenamnt = new JTextField();
        jtopenamnt.setBounds(250, 150, 400,20);

        id = new JLabel("A/C Number :");
        id.setBounds(100,180,200,20);
        jtid = new JTextField();
        jtid.setBounds(250, 180, 400, 20);

        add(name);add(email);add(phone);add(location);add(openamnt);add(id);add(serch);
        add(jtname);add(jtemail);add(jtphone);add(jtlocation);add(jtopenamnt);add(jtid);add(jtsearch);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        submit.setBounds(380, 240, 100, 20);
        add(submit);


        menuob =new MenuClass(this);
        setJMenuBar(menuob.menubar());
        //setJMenuBar(menubar());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {


        new Update();
    }


}