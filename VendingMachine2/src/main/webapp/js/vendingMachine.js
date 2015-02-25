$('document').ready(function () {
    loadInventory();
    
    $('#insert-money').click(function(event) {
        event.preventDefault();
        $.ajax({
            type: 'POST',
            url: 'change',
            data: JSON.stringify({
                totalChange: $('#money-input').val()
            }),
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            'data-type': 'json'
        }).success(function(){
            $('#money-input').val('');
            loadMoney();
        });
    });
    
});

//   FUNCTIONS

function loadInventory() {
    //  CLEARS TABLE - NO REPEATS!!!
    clearInventory();

    //  GRAB TABLE ELEMENT !!!!
    var snackTable = $('#content-rows');

    //  WRITE EACH SNACK TO THE TABLE !!!!!

    $.ajax({
        url: 'snacks'
    }).success(function (data, status) {
        $.each(data, function (index, snack) {
            if (snack.snackLeft === 0) {
                snack.image = "./img/itemOut.jpg";
            }
            snackTable.append($('<tr>')
                    .append($('<td>')
                            .append($('<img>')
                                    .addClass('snack-image')
                                    .attr({'src': snack.image})
                                    )
                            )
                    .append($('<td>')
                            .append($('<ul>')
                                    .append($('<li>')
                                            .addClass('snack-text')
                                            .text('Snack #: ' + snack.snackId)
                                            )
                                    .append($('<li>')
                                            .addClass('snack-text')
                                            .text('Name: ' + snack.snackName)
                                            )
                                    .append($('<li>')
                                            .addClass('snack-text')
                                            .text('# in Stock: ' + snack.snackLeft)
                                            )
                                    .append($('<li>')
                                            .text('Price: $' + snack.snackPrice)
                                            )
                                    )
                            )
                    );
        });
    });
}



function clearInventory() {
    $('#content-rows').empty();
}

function loadMoney(){
    
}