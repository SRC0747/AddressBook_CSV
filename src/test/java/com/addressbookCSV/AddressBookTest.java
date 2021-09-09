package com.addressbookCSV;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
//import junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.io.Console;
import java.util.*;
import java.util.stream.Collectors;

class AddressBookTest {
    public static void main(String[] main(){
        AddressBookTest obj = new AddressBookTest();
        ArrayList<MultipleDetail> details = new ArrayList<MultipleDetail>();
        //Adding Details
        details.add(new MultipleDetail("Rakesh Jaiswal","Amhastreet","Kolkata","WestBengal","9632457896","rjsrc@gmail.com"));
        details.add(new MultipleDetail("Abhishek""Baguihati","Kolkata","WestBengal","7044589936","abhi37@gmail.com"));
        details.add(new MultipleDetail("Sampriti","Belepole","Howrah","WestBengal","7044585321","srcsrk0747@gmail.com"));
        details.stream().filter(details -> details.city == "Kolkata" && details -> details.state == "WestBengal").forEach(details -> System.out.println(details.name));

        //Dictionary of City and Person.
        HashTable <City,Person> mydict_1 = new  Hashtable<City,Person>();
        //put method() to print output.
        mydict_1.put("Kolkata","Rakesh");
        mydict_1.put("Howrah","Sampriti");
        //get method() to take input.
        System.out.println("\nPerson at Kolkata is:"+mydict_1.get("Kolkata"));
        System.out.println("\nPerson at Howrah is:"+mydict_1.get("Howrah"));


        //Dictionary of State and Person.
        HashTable <State,Person> mydict_1 = new  Hashtable<State, Person>();
        //put method() to print output.
        mydict_1.put("West Bengal","Rakesh");
        mydict_1.put(Mumbai","Sampriti");
                //get method() to take input.
                System.out.println("\n Person at West Bengal is:"+mydict_1.get("West Bengal"));
        System.out.println("\n Person at Mumbai is:"+mydict_1.get("Mumbai"));
    }

    @Test
    public void toEnter_PersonDetail(){
        obj.personDetail();
    }

    @Test
    public void toEnter_ContactDetail_NewPerson() {
        obj.contactNewPerson();
    }

    @Test
    public void toEdit_ContactDetail() {
        obj. editContactDetail();
    }

    @Test
    public void toDelete_ContactPerson() {
        obj.clearconsole();
    }

    @Test
    public void toDisplay_MultiplePersonContact() {
        obj. multiplePersonDetail();
    }

    @Test
    public void toDisplay_AddressBook() {
        obj.multiDetailAddressBook();
    }

    @Test
    public void toOverride_Detail() {
        System.out.println(equals(AddressBookTest obj));
    }
}