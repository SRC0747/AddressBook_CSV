package com.addressbookCSV;

import org.junit.jupiter.api.Test;
//import junit.jupiter.api.Assertions.*;

class AddressBookTest {
    AddressBookTest obj = new AddressBookTest();

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
}