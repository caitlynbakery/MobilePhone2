package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone mobilePhone = new MobilePhone("1234567");
        mobilePhone.addNewContact(new Contact("Jim", "98765432"));
        mobilePhone.addNewContact(new Contact("Tom", "290290292"));
        mobilePhone.addNewContact(new Contact("Jim", "98765432"));
    }
}
