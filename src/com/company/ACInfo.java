package com.company;

public class ACInfo {

    String id, name, email, balance,phone, location;

    public ACInfo(String id, String name, String email,  String phone, String balance, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.location = location;
    }


    @Override
    public String toString() {

        return id +" "+name+" "+email+" "+phone+" "+balance+" "+location;
    }
}
