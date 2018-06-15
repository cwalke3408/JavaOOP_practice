package com.company;

public class Person {
    String name;
    String email;
    String phone;

    //constructor
    public Person(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void printGreeting(Person person){
        System.out.println("Hello "+ person.getName()+", im "+ name);
    }

}
