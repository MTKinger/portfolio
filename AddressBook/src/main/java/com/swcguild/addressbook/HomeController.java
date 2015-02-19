package com.swcguild.addressbook;

import com.swcguild.addressbook.dao.ContactDao;
import com.swcguild.addressbook.dto.Contact;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
    
    private ContactDao dao;
    
    @Autowired
    public HomeController(ContactDao dao){
        this.dao = dao;
    }
    
    
    @RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String displayHomePage(){
        return "home";
    }
    
    @RequestMapping(value = "/contact", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody public Contact createContact(@RequestBody Contact contact){
        dao.addContact(contact);
        return contact;
    }
    
    @RequestMapping(value="/contacts", method=RequestMethod.GET)
    @ResponseBody public List<Contact> getAllContacts(){
        return dao.getAllContacts();
    }
    
    @RequestMapping(value="/contact/{id}", method=RequestMethod.GET)
    @ResponseBody public Contact getContact(@PathVariable int id){
        return dao.getContactById(id);
    }
    
    @RequestMapping(value="contact/{id}", method=RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateContact(@PathVariable("id") int id, @RequestBody Contact contact){
        contact.setContactId(id);
        dao.updateContact(contact);
    }
    
    @RequestMapping(value="/contact/{id}", method=RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteContact(@PathVariable("id") int id){
        dao.removeContact(id);
    }
    

}
