package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {


    public static HashMap<String, Integer> map(HashMap<String, Integer> a){


        a.put("apel",200);

        return a;
    }

    public static void main(String[] args) {


        HashMap<String, Integer> a = new  HashMap();


        a.put("a",1);
        a.put("2",2);
        a.put("3",3);
        a.put("4",4);


        HashMap<String, Integer> a2 = new  HashMap<>();

        a2 =map(a);


        a.put("a",100);

        System.out.println(a.size()+a.get("a"));


        Set set = a.keySet();

        String temp=null;
        String rmv=null;
        Iterator<String> it = set.iterator();

        while (it.hasNext()){

            temp =it.next();


            System.out.println(temp+" : "+ a.get(temp));
            }




        System.out.println("after remove"+a.size());

    }
}
