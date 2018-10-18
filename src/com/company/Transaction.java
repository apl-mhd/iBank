package com.company;

import java.util.HashMap;

public class Transaction {

    public void deposit(String dpamount, String key,  HashMap<String, ACInfo> map,InfoMap ob) {

        ACInfo ob2 = map.get(key);


        System.out.println(ob2);


        Integer a =Integer.parseInt( ob2.balance);
        System.out.println(dpamount);

        Integer sum = Integer.parseInt(dpamount);
        sum +=a;

        ob2.balance = String.valueOf(sum);

        map.put(key,ob2);
        ob.writeToFile(map);



    }

    public void witdraw(String dpamount, String key,  HashMap<String, ACInfo> map,InfoMap ob) {

        ACInfo ob2 = map.get(key);


        System.out.println(ob2);


        Integer a =Integer.parseInt( ob2.balance);
        //System.out.println(dpamount);

        Integer sum = Integer.parseInt(dpamount);
        a-=sum;

        ob2.balance = String.valueOf(a);

        map.put(key,ob2);
        ob.writeToFile(map);

    }

}
