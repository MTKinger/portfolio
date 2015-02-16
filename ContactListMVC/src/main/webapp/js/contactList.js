$(document).ready(function(){
   loadContacts(); 
});

//=========
//FUNCTIONS
//=========

// THIS WILL LOAD THE CONTACTS INTO THE SUMMARY TABLE
function loadContacts(){ 
//  CLEAR THE TABLE
    clearContactTable();
//  GRAB THE HTML ELEMENT INTO WHICH WE WILL LOAD THE DATA
    var cTable =$('#contentRows');
//  ITERATE THROUGH EACH OF THE JSON OBJECTS IN THE TEST DATA AND RENDER THEM 
//  INTO THE TABLE
    $.each(testContactData, function(index, contact) {
        cTable.append($('<tr>')
                .append($('<td>')
                .append($('<a>').attr({'data-contact-id' : contact.contactId, 'data-toggle' : 'modal', 'data-target' : '#detailsModal' })
                .text(contact.firstName + ' ' + contact.lastName)))
                .append($('<td>').text(contact.company))
                .append($('<td>').text('Edit'))
                .append($('<td>').text('Delete'))
                );
    });
};

//  CLEAR ALL CONTENT ROWS FROM THE SUMMARY TABLE
function clearContactTable(){
    $('#contentRows').empty();
}

//  THIS CODE RUNS IN RESPONSE TO show.bs.modal EVENT
$('#detailsModal').on('show.bs.modal', function(event) {
//   GET THE ELEMENT THAT TRIGGERED THE EVENT
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');
    
//    PLACEHOLDER - use dummy data for now.
var modal = $(this);
modal.find('#contact-id').text(dummyDetailsContact.contactId);
modal.find('#contact-firstName').text(dummyDetailsContact.firstName);
modal.find('#contact-lastName').text(dummyDetailsContact.lastName);
modal.find('#contact-company').text(dummyDetailsContact.company);
modal.find('#contact-email').text(dummyDetailsContact.email);
modal.find('#contact-phone').text(dummyDetailsContact.phone);
});


// TEST DATA

var testContactData = [
    {
        contactId: 1,
        firstName: "Susan",
        lastName: "Williams",
        company: "IBM",
        email: "sWilliams@IBM.com",
        phone: "555-1212"
    },
    {
        contactId: 2,
        firstName: "George",
        lastName: "Smith",
        company: "EMC",
        email: "smith@EMC.com",
        phone: "555-1234"
    },
    {
        contactId: 3,
        firstName: "Chuck",
        lastName: "Knobloch",
        company: "3M",
        email: "chuck@3M.com",
        phone: "555-5656"
    }
];

var dummyDetailsContact = 
{
            contactId : 42,
            firstName: "Kent",
            lastName: "Hrbek",
            company: "3M",
            email: "kent@3M.com",
            phone: "555-0892",
};