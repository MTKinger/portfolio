package com.swcguild.addressbook.dao;


import com.swcguild.addressbook.dto.Contact;
import com.swcguild.addressbook.dto.Contact;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public interface ContactDao {
    
    public void addContact(Contact contact);
    public void removeContact(int contactId);
    public void updateContact(Contact contact);
    public List<Contact> getAllContacts();
    public Contact getContactById(int contactId);
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria);
    
}
