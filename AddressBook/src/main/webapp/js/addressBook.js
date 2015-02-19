$(document).ready(function () {
    loadContacts();

    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'contact',
            data: JSON.stringify({
                firstName: $('#add-first-name').val(),
                lastName: $('#add-last-name').val(),
                streetAddress: $('#add-street-address').val(),
                city: $('#add-city').val(),
                state: $('#add-state').val(),
                zip: $('#add-zip').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            $('#add-first-name').val('');
            $('#add-last-name').val('');
            $('#add-street-address').val('');
            $('#add-city').val('');
            $('#add-state').val('');
            $('#add-zip').val('');
            loadContacts();
        });
    });
    $('#edit-button').click(function (event) {
        event.preventDefault();

        $.ajax({
            type: 'PUT',
            url: 'contact/' + $('#edit-contact-id').val(),
            data: JSON.stringify({
                contactId: $('#edit-contact-id').val(),
                firstName: $('#edit-first-name').val(),
                lastName: $('#edit-last-name').val(),
                streetAddress: $('#edit-street-address').val(),
                city: $('#edit-city').val(),
                state: $('#edit-state').val(),
                zip: $('#edit-zip').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadContacts();
        });
    });
});

//=========
//FUNCTIONS
//=========

// THIS WILL LOAD THE CONTACTS INTO THE SUMMARY TABLE
function loadContacts() {
//  CLEAR THE TABLE
    clearContactTable();
//  GRAB THE HTML ELEMENT INTO WHICH WE WILL LOAD THE DATA
    var cTable = $('#contentRows');
//  ITERATE THROUGH EACH OF THE JSON OBJECTS IN THE TEST DATA AND RENDER THEM 
//  INTO THE TABLE

    $.ajax({
        url: 'contacts'
    }).success(function (data, status) {
        $.each(data, function (index, contact) {
            cTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({'data-contact-id': contact.contactId, 'data-toggle': 'modal', 'data-target': '#detailsModal'})
                                    .text(contact.firstName + ' ' + contact.lastName)
                                    )
                            )
                    .append($('<td>').text(contact.streetAddress))
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({'data-contact-id': contact.contactId, 'data-toggle': 'modal', 'data-target': '#editModal'})
                                    .text('Edit')
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteContact(' + contact.contactId + ')'
                                    })
                                    .text('Delete')
                                    )
                            )
                    );
        });

    });
}

function deleteContact(id) {
    var answer = confirm("Do you really want to delete this contact?");

    if (answer) {
        $.ajax({
            type: 'DELETE',
            url: 'contact/' + id
        }).success(function () {
            loadContacts();
        });
    }
}


//  CLEAR ALL CONTENT ROWS FROM THE SUMMARY TABLE
function clearContactTable() {
    $('#contentRows').empty();
}

//  THIS CODE RUNS IN RESPONSE TO show.bs.modal EVENT
$('#detailsModal').on('show.bs.modal', function (event) {
//   GET THE ELEMENT THAT TRIGGERED THE EVENT
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');

//    PLACEHOLDER - use dummy data for now.
    var modal = $(this);
    
    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId
    }).success(function(contact){
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#contact-firstName').text(contact.firstName);
        modal.find('#contact-lastName').text(contact.lastName);
        modal.find('#contact-street-address').text(contact.streetAddress);
        modal.find('#contact-city').text(contact.city);
        modal.find('#contact-state').text(contact.state);
        modal.find('#contact-zip').text(contact.zip);
    });
});

$('#editModal').on('show.bs.modal', function(event){
    var element = $(event.relatedTarget);
    var contactId = element.data('contact-id');
    
    var modal = $(this);
    
    $.ajax({
        type: 'GET',
        url: 'contact/' + contactId
    }).success(function(contact){
        modal.find('#contact-id').text(contact.contactId);
        modal.find('#edit-contact-id').val(contact.contactId);
        modal.find('#edit-first-name').val(contact.firstName);
        modal.find('#edit-last-name').val(contact.lastName);
        modal.find('#edit-street-address').val(contact.streetAddress);
        modal.find('#edit-city').val(contact.city);
        modal.find('#edit-state').val(contact.state);
        modal.find('#edit-zip').val(contact.zip);
    })
    
})


// TEST DATA

var testContactData = [
    {
        contactId: 1,
        firstName: "Susan",
        lastName: "Williams",
        streetAddress: "123 Street Road",
        city: "Warrington",
        state: "PA",
        zip: "18929"
    },
    {
        contactId: 2,
        firstName: "George",
        lastName: "Smith",
        streetAddress: "456 County Line Road",
        city: "Jamison",
        state: "PA",
        zip: "12345"
    },
    {
        contactId: 3,
        firstName: "Chuck",
        lastName: "Knobloch",
        streetAddress: "1383 Brook Lane",
        city: "Philadelphia",
        state: "PA",
        zip: "19116"
    }
];

var dummyDetailsContact =
        {
            contactId: 27,
            firstName: "Mike",
            lastName: "King",
            streetAddress: "401 South Main Street",
            city: "Akron",
            state: "OH",
            zip: "44311"
        };