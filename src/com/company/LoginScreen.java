package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public  class LoginScreen extends JFrame implements ActionListener
{

    JButton jbLogin, jbReset;
    JTextField jtfUser;
    JPasswordField jpfPass;
    JLabel jlUser, jlPass;



    public LoginScreen (String name)
    {
        super(name);
        jbLogin = new JButton("Login");
        jbReset = new JButton("Reset");


        jtfUser = new JTextField();
        jpfPass = new JPasswordField();

        jlUser = new JLabel("Username:");
        jlPass = new JLabel("Password:");

        this.setLayout(null);
        setBounds(400,200,500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jbLogin.addActionListener(this);
        jbReset.addActionListener(this);


        jlUser.setBounds(10,10,120,20);
        jlPass.setBounds(10,30,120,20);

        jtfUser.setBounds(140,10,200,20);
        jpfPass.setBounds(140,30,200,20);

        jbLogin.setBounds(140,55,100,20);
        jbReset.setBounds(240,55,100,20);


        this.add(jlUser);
        this.add(jlPass);
        this.add(jtfUser);
        this.add(jpfPass);
        this.add(jbLogin);
        this.add(jbReset);


        // this.setSize(500,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        System.out.println(jtfUser.getText());

        if(e.getSource() == jbLogin){

            if(jtfUser.getText().length()==0 || jpfPass.getPassword().length ==0){
                JOptionPane.showMessageDialog(null,"User name or password" +
                        "can n't be empty! ");
            }

            if(jtfUser.getText().equals("admin")==true){


                if ( Arrays.equals( "1234".toCharArray(), jpfPass.getPassword() ) )
                {
                    JOptionPane.showMessageDialog(null,"Log in successful");

                    dispose();
                    new CreateAc();
                    //System.out.println("aaa");

                }
                else {
                    JOptionPane.showMessageDialog(null,"Wrong username or password");
                }

            }

            else {
                JOptionPane.showMessageDialog(null,"Wrong username or password");
            }
        }

    }

}


