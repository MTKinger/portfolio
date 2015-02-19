<!-- DETAILS MODAL FRAGMENT -->

<div class="modal fade" id="detailsModal" tabindex="-1" role="dialog" aria-labelledby="detailsModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">
                                    <span class="sr-only">Close</span>
                                </button>
                                <h4 class="modal-title" id="detailsModalLabel">Contact Details</h4>
                            </div>
                            <div class="modal-body">
                                <h3 id="contact-id"></h3>
                                <table class="table table-bordered">
                                    <tr>
                                        <th>First Name</th>
                                        <td id="contact-firstName"></td>
                                    </tr>
                                    <tr>
                                        <th>Last Name</th>
                                        <td id="contact-lastName"></td>
                                    </tr>
                                    <tr>
                                        <th>Street Address</th>
                                        <td id="contact-street-address"></td>
                                    </tr>
                                    <tr>
                                        <th>City</th>
                                        <td id="contact-city"></td>
                                    </tr>
                                    <tr>
                                        <th>State</th>
                                        <td id="contact-state"></td>
                                    </tr>
                                    <tr>
                                        <th>Zip</th>
                                        <td id="contact-zip"></td>
                                    </tr>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div> 
                </div>


<!-- EDIT MODAL -->

<div class="modal fade" id="editModal" tabindex="-1" role="dialog" >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="editModalLabel">Edit Contact</h4>
            </div>
            <div class="modal-body">
                <h3 id="contact-id"></h3>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="edit-first-name" class="col-md-4 control-label">
                            First Name:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-first-name" placeholder="First Name" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-last-name" class="col-md-4 control-label">
                            Last Name:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-last-name" placeholder="Last Name" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-street-address" class="col-md-4 control-label">
                            Street Address::
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-street-address" placeholder="Street Address" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-city" class="col-md-4 control-label">
                            City:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-city" placeholder="City" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-state" class="col-md-4 control-label">
                            State:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-state" placeholder="State" >
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-zip" class="col-md-4 control-label">
                            Zip Code:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-zip" placeholder="Zip Code" >
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-primary" data-dismiss="modal">
                                Edit Contact
                            </button>
                            <button type="button" class="btn btn-danger" data-dismiss="modal">
                                Cancel
                            </button>
                            <input type="hidden" id="edit-contact-id">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>