package com.company;

public class Vehicle {
    private String owner;
    private String model;
    private int year;

    // Constructor
    Vehicle(String owner, String model, int year){
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    // Methods
    public String toString(){
        String mystr = "The owner: " + owner + " owns " + model + " from "+ year;
        return mystr;
    }
}
