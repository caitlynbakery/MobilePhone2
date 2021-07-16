package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone mobilePhone = new MobilePhone("1234567");
        mobilePhone.addNewContact(new Contact("Jim", "98765432"));
        mobilePhone.addNewContact(new Contact("Tom", "290290292"));
        mobilePhone.addNewContact(new Contact("Jim", "98765432"));

mobilePhone.updateContact(new Contact("Jim", "98765432"), new Contact("Ben", "886728472"));
mobilePhone.queryContact("Ben");
mobilePhone.printContacts();
//        mobilePhone.removeContact(new Contact("Tom", "290290292"));
    }
}
