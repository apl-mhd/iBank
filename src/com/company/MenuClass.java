package com.company;
import javax.swing.*;

public class MenuClass {

    CreateAc createob;
    ViewAC obview;
    Deposite dpob;
    Withdraw withob;
    Update updateob;
    Delete dltob;

    public MenuClass(Delete dltob) {
        this.dltob = dltob;
    }

    public MenuClass(Update updateob) {
        this.updateob = updateob;
    }

    public MenuClass(Withdraw withob) {
        this.withob = withob;
    }

    MenuClass(Deposite dpob){

        this.dpob = dpob;

    }

    MenuClass(CreateAc createob){

        this.createob=createob;
    }

    MenuClass(ViewAC obview){

        this.obview = obview;
    }

    JMenu newAC, view,dp, wd, updt, dlt;
    JMenuItem ac, viewall, dpitm,wditm,dltitm, updtItm;


    JMenuBar menubar(){
        JMenuBar jMenuBar = new JMenuBar();

        newAC = new JMenu(" New A/C");
        view = new JMenu("View A/C");
        dp = new JMenu("Deposit");
        wd = new JMenu("Withdraw");
        updt = new JMenu("Update");
        dlt = new JMenu("Delete");

        ac = new JMenuItem("Open New Account");
        viewall = new JMenuItem("View All Accounts");
        dpitm = new JMenuItem("Deposit Money");
        wditm = new JMenuItem("Withdraw Money");
        updtItm = new JMenuItem("Update Account");
        dltitm = new JMenuItem("Delete Account");

        newAC.add(ac);
        view.add(viewall);
        dp.add(dpitm);
        wd.add(wditm);
        updt.add(updtItm);
        dlt.add(dltitm);


        viewall.addActionListener(( createob)); //create
        viewall.addActionListener(dpob);//deposit
        viewall.addActionListener(withob);//withdraw
        viewall.addActionListener(updateob);//update
        viewall.addActionListener(dltob);

        ac.addActionListener(obview);//view
        ac.addActionListener(dpob);//deposit
        ac.addActionListener(withob);//withdraw
        ac.addActionListener(updateob);//update
        ac.addActionListener(dltob);

        dpitm.addActionListener(createob);//create
        dpitm.addActionListener(obview);//view
        dpitm.addActionListener(withob);//withdraw
        dpitm.addActionListener(updateob);//update
        dpitm.addActionListener(dltob);


        wditm.addActionListener(createob);//creat
        wditm.addActionListener(obview);//viw
        wditm.addActionListener(dpob);//diposit
        wditm.addActionListener(updateob);//update
        wditm.addActionListener(dltob);

        updtItm.addActionListener(createob);//creat
        updtItm.addActionListener(obview);//viw
        updtItm.addActionListener(dpob);//diposit
        updtItm.addActionListener(withob);//withdraw
        updtItm.addActionListener(dltob);

        dltitm.addActionListener(createob);//creat
        dltitm.addActionListener(obview);//viw
        dltitm.addActionListener(dpob);//diposit
        dltitm.addActionListener(withob);//withdraw
        dltitm.addActionListener(updateob);





        jMenuBar.add(newAC);
        jMenuBar.add(view);
        jMenuBar.add(dp);
        jMenuBar.add(wd);
        jMenuBar.add(updt);
        jMenuBar.add(dlt);

        return jMenuBar;
    }
}