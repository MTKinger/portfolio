$(document).ready(function () {
    loadDVD();
    $('#add-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'dvd',
            data: JSON.stringify({
                title: $('#add-title').val(),
                releaseYear: $('#add-release-year').val(),
                rating: $('#add-rating').val(),
                director: $('#add-director').val(),
                studio: $('#add-studio').val(),
                comments: $('#add-comments').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            $('#add-title').val('');
            $('#add-release-year').val('');
            $('#add-rating').val('');
            $('#add-director').val('');
            $('#add-studio').val('');
            $('#add-comments').val('');
            loadDVD();
        });
    });
    $('#edit-button').click(function (event) {
        event.preventDefault();
        $.ajax({
            type: 'PUT',
            url: 'dvd/' + $('#edit-dvd-id').val(),
            data: JSON.stringify({
                dvdId: $('#edit-dvd-id').val(),
                title: $('#edit-title').val(),
                releaseYear: $('#edit-release-year').val(),
                rating: $('#edit-rating').val(),
                director: $('#edit-director').val(),
                studio: $('#edit-studio').val(),
                comments: $('#edit-comments').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'dataType': 'json'
        }).success(function () {
            loadDVD();
        });
    });
});
function loadDVD() {
    clearDVDTable();
    var cTable = $('#contentRows');
    $.ajax({
        url: 'dvds'
    }).success(function (data, status) {
        $.each(data, function (index, dvd) {
            cTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({'data-dvd-id': dvd.dvdId, 'data-toggle': 'modal', 'data-target': '#detailsModal'})
                                    .text(dvd.title)
                                    )
                            )
                    .append($('<td>').text(dvd.releaseYear))
                    .append($('<td>').text(dvd.director))
                    .append($('<td>')        
                    .append($('<a>')
                                    .attr({'data-dvd-id': dvd.dvdId, 'data-toggle': 'modal', 'data-target': '#editModal'})
                                    .text('Edit')
                                    )
                            )
                    .append($('<td>')
                            .append($('<a>')
                                    .attr({
                                        'onClick': 'deleteDVD(' + dvd.dvdId + ')'
                                    })
                                    .text('Delete')
                                    )
                            )
                    );
        });
    });
}

function deleteDVD(id){
    var answer = confirm("Do you really want to delete this DVD?");
    
    if (answer){
        $.ajax({
            type: 'DELETE',
            url: 'dvd/' + id
        }).success(function(){
            loadDVD();
        });
    }
}

function clearDVDTable(){
    $('#contentRows').empty();
}

// This code runs in response to show.bs.modal event for the details Modal
$('#detailsModal').on('show.bs.modal', function (event) {
    // get the element that triggered the event
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');

    // PLACEHOLDER - use dummy data for now
    var modal = $(this);

//    MAKE AN AJAX CALL TO GET BACK OUR SPECIFIED CONTACT
    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#dvd-title').text(dvd.title);
        modal.find('#dvd-release-year').text(dvd.releaseYear);
        modal.find('#dvd-rating').text(dvd.rating);
        modal.find('#dvd-director').text(dvd.director);
        modal.find('#dvd-studio').text(dvd.studio);
        modal.find('#dvd-comments').text(dvd.comments);
    });
});

// This code runs in response to the show.bs.modal event for the edit Modal
$('#editModal').on('show.bs.modal', function (event) {
    var element = $(event.relatedTarget);
    var dvdId = element.data('dvd-id');

    var modal = $(this);

    $.ajax({
        type: 'GET',
        url: 'dvd/' + dvdId
    }).success(function (dvd) {
        modal.find('#dvd-id').text(dvd.dvdId);
        modal.find('#edit-dvd-id').val(dvd.dvdId);
        modal.find('#edit-title').val(dvd.title);
        modal.find('#edit-release-year').val(dvd.releaseYear);
        modal.find('#edit-rating').val(dvd.rating);
        modal.find('#edit-director').val(dvd.director);
        modal.find('#edit-studio').val(dvd.studio);
        modal.find('#edit-comments').val(dvd.comments);
    });
});