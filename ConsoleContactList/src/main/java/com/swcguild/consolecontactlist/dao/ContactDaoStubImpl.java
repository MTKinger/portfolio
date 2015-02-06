package com.swcguild.consolecontactlist.dao;

import com.swcguild.consolecontactlist.dto.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoStubImpl implements ContactDao{

    @Override
    public void add(Contact contact) {
    }

    @Override
    public void remove(int contactId) {
    }

    @Override
    public void update(Contact contact) {
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact dummyContact = new Contact();
        dummyContact.setContactId(42);
        dummyContact.setFirstName("John");
        dummyContact.setLastName("Doe");
        dummyContact.seteMail("jdoe@doe.com");
        return dummyContact;
    }

    @Override
    public List<Contact> getAllContacts() {
        Contact dummyContact = new Contact();
        dummyContact.setContactId(42);
        dummyContact.setFirstName("John");
        dummyContact.setLastName("Doe");
        dummyContact.seteMail("jdoe@doe.com");
        
        Contact dummyContact1 = new Contact();
        dummyContact1.setContactId(43);
        dummyContact1.setFirstName("Sally");
        dummyContact1.setLastName("Doe");
        dummyContact1.seteMail("sdoe@doe.com");
        
        List<Contact> contactList = new ArrayList<>();
        contactList.add(dummyContact);
        contactList.add(dummyContact1);
        
        return contactList;
        
    }
    
    

}
