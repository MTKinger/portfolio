package com.swcguild.consolecontactlist.controller;

import com.swcguild.consolecontactlist.dao.ContactDao;

public class ContactController {
    
    private ContactDao dao;
    
    public ContactController(ContactDao dao){
        this.dao = dao;
    }
    
    public void run(){
        System.out.println("Runnin' Spring fast...");
    }

}
