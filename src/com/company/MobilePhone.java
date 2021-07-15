package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact){
        if(findContact(newContact) < 0){
            myContacts.add(newContact);
            System.out.println(newContact.getName() + " was added with phone num " + newContact.getPhoneNumber());
            return true;
        } else {
            System.out.println("Contact already exists");
            return false;
        }
    }

    private int findContact(Contact findContact){
        return this.myContacts.indexOf(findContact);


    }
}
