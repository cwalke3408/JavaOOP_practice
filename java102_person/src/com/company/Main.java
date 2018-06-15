package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person sonny = new Person("Sonny", "sonney@aol.com", "483-485-4948");
        Person jordan = new Person("Jordan", "jordan@aol.com","495-586-3456");

        //Use setter to change number
        sonny.setPhone("123-434-4323");

        //Use get to grab phone number
        System.out.println(sonny.getPhone());
        System.out.println(jordan.getPhone());

        //use greetings method to say hello to somebody else
        sonny.printGreeting(jordan);
        jordan.printGreeting(sonny);

    }
}
