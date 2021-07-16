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
        System.out.println("Index = " + findContact(newContact.getName()));
        if(findContact(newContact.getName()) >= 0){
            System.out.println("Contact already exists");
            return false;
        }
         else {
            myContacts.add(newContact);
            System.out.println(newContact.getName() + " was added with phone num " + newContact.getPhoneNumber());
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact.getName()) >= 0){
            myContacts.set(findContact(oldContact.getName()), newContact);
            System.out.println("ITEM REPLACED");
            return true;
        } else{
            System.out.println("Contact does not exist");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            myContacts.remove(contact);
            System.out.println("Item " + contact.getName() + " was removed");
            return true;
        } else{
            System.out.println("Item not found");
            return false;
        }
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String newName){
        for(int i = 0; i<myContacts.size(); i++){
            Contact newContact = myContacts.get(i);
            if(newContact.getName().equals(newName)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        if(findContact(contactName) >= 0){
            System.out.println("Returning " + myContacts.get(findContact(contactName)).getName());
            return myContacts.get(findContact(contactName));

        }else {
            return null;
        }
    }

    public void printContacts(){
        for(int i = 0; i<myContacts.size(); i++){
            System.out.println(myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
