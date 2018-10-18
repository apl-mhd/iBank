package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class InfoMap {





    public  HashMap<String, ACInfo> totalList(){

        HashMap<String, ACInfo> map = new HashMap<>();

        try {

            FileReader fileReader = new FileReader("ac.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //System.out.println(bufferedReader.readLine());


            String line = bufferedReader.readLine();


            while (line!=null){

                String t[] = line.split(" ");

               // String id, String name, String email, String balance, String phone, String location) {
                map.put(t[0], new ACInfo(t[0],t[1],t[2],t[3],t[4],t[5]));

                line = bufferedReader.readLine();


            }

            bufferedReader.close();
            fileReader.close();


        }
        catch (Exception e){}




        return map;
    }



    void writeToFile(HashMap<String, ACInfo> map){


        try {
            FileWriter fw = new FileWriter("ac.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            Set set = map.keySet();
            Iterator<String> it = set.iterator();
            String key=null;

            while (it.hasNext()){

                key = it.next();
                System.out.println(key);

                bw.write(map.get(key).id+" "+map.get(key).name+" "+
                                map.get(key).email+" "+map.get(key).phone+" "+map.get(key).balance+" "+
                 map.get(key).location+"\n");
            }


            bw.close();
            fw.close();



        }
        catch (Exception e){}
    }


    public static void main(String[] args) {


        HashMap<String, ACInfo> map = new InfoMap().totalList();

        System.out.println("aaa"+map.size());
        System.out.println(map.get("1"));


    }


}
