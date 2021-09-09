package com.addressbookCSV;

import org.junit.jupiter.api.Test;
//import junit.jupiter.api.Assertions.*;

class AddressBookTest {
    AddressBookTest obj = new AddressBookTest();

    @Test
    public void toEnter_PersonDetail(){
        obj.toEnter_PersonDetail();
    }

    @Test
    public void toEnter_ContactDetail_NewPerson() {
        obj.toEnter_ContactDetail_NewPerson();
    }

    @Test
    public void toEdit_ContactDetail() {
        obj.toEdit_ContactDetail();
    }
}