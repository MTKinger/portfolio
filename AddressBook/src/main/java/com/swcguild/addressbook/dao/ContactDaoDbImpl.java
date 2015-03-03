package com.swcguild.addressbook.dao;

import com.swcguild.addressbook.dto.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class ContactDaoDbImpl implements ContactDao{
    
    private static final String SQL_INSERT_CONTACT
            = "INSERT INTO addresses (first_name, last_name, street_address, city, state, zip)"
            + " values(?,?,?,?,?,?)";
    
    private static final String SQL_UPDATE_CONTACT
            ="UPDATE addresses SET first_name = ?, last_name = ?, street_address = ?, city = ?, state = ?, zip = ?"
            + " WHERE address_id = ?";
    
    private static final String SQL_SELECT_ALL_CONTACTS
            = "SELECT * FROM addresses";
    
    private static final String SQL_SELECT_CONTACT
            = "SELECT * FROM addresses WHERE address_id = ?";
    
    private static final String SQL_DELETE_CONTACT
            = "DELETE FROM addresses WHERE address_id = ?";
    
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addContact(Contact contact) {
        jdbcTemplate.update(SQL_INSERT_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getStreetAddress(),
                contact.getCity(),
                contact.getState(),
                contact.getZip());
        contact.setContactId(jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class));
    }

    @Override
    public void removeContact(int contactId) {
        jdbcTemplate.update(SQL_DELETE_CONTACT, contactId);
    }

    @Override
    public void updateContact(Contact contact) {
        jdbcTemplate.update(SQL_UPDATE_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getStreetAddress(),
                contact.getCity(),
                contact.getState(),
                contact.getZip(),
                contact.getContactId());
    }

    @Override
    public List<Contact> getAllContacts() {
        return jdbcTemplate.query(SQL_SELECT_ALL_CONTACTS, new ContactMapper());
    }

    @Override
    public Contact getContactById(int contactId) {
        try{
            return jdbcTemplate.queryForObject(SQL_SELECT_CONTACT,
                    new ContactMapper(), contactId);
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
    }

    @Override
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final class ContactMapper implements ParameterizedRowMapper<Contact>{

        @Override
        public Contact mapRow(ResultSet rs, int i) throws SQLException {
            Contact contact = new Contact();
            contact.setContactId(rs.getInt("address_id"));
            contact.setFirstName(rs.getString("first_name"));
            contact.setLastName(rs.getString("last_name"));
            contact.setStreetAddress(rs.getString("street_address"));
            contact.setCity(rs.getString("city"));
            contact.setState(rs.getString("state"));
            contact.setZip(rs.getString("zip"));
            return contact;
        }
        
        
        
    }
    
    

}
