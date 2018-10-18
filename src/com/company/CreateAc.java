package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateAc extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        String info[] = new String[6];


        if (e.getSource()==menuob.dpitm){

    //        System.out.println("aaaaaaaaaa");

            dispose();
            new Deposite();
        }
        if(e.getSource()==menuob.viewall){


            dispose();
            new ViewAC();
        }



        if(e.getSource()==menuob.dltitm){


            dispose();
            new Delete();
        }



        if(e.getSource()==menuob.updtItm){

            dispose();
            new Update();
        }


        if(e.getSource()==menuob.wditm){

            dispose();
            new Withdraw();
        }




        if(e.getSource() == submit){

            info[0]= jtid.getText();
            info[1]= jtname.getText();
            info[2]= jtemail.getText();
            info[3]= jtphone.getText();
            info[4]= jtopenamnt.getText();
            info[5]= jtlocation.getText();



            jtname.setText("");
            jtemail.setText("");
            jtphone.setText("");
            jtlocation.setText("");
            jtopenamnt.setText("");
            jtid.setText("");




            try {

                FileWriter fw = new FileWriter("ac.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(info[0]+" "+info[1]+" "+info[2]+" "+info[3]+" "+info[4]+" "+info[5]+"\n");
                bw.close();
                fw.close();



            }
            catch (Exception ex){}

            JOptionPane.showMessageDialog(null, "A/C create successful");
        }

    }

    JLabel  id, name,  email, phone, location, openamnt;
    JTextField jtname, jtemail, jtphone, jtlocation, jtopenamnt, jtid;


    JButton submit;


    MenuClass menuob;

    CreateAc(){
        setSize(1000,800);
        this.setLayout(null);



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

        openamnt = new JLabel("Opening Amount :");
        openamnt.setBounds(100,150,200,20);
        jtopenamnt = new JTextField();
        jtopenamnt.setBounds(250, 150, 400,20);

        id = new JLabel("A/C Number :");
        id.setBounds(100,180,200,20);
        jtid = new JTextField();
        jtid.setBounds(250, 180, 400, 20);

        add(name);add(email);add(phone);add(location);add(openamnt);add(id);
        add(jtname);add(jtemail);add(jtphone);add(jtlocation);add(jtopenamnt);add(jtid);

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


        new CreateAc();
    }


}