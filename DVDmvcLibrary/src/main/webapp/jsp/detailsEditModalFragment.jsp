<!-- Details Modal -->

<div class="modal fade" id="detailsModal" tabindex="-1" role="dialog" aria-labeledby="detailModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span>Close</span>
                </button>
                <h4 class="modal-title" id="detailsModalLabel">Movie Details</h4>
            </div>
            <div class="modal-body">
                <h3 id="dvd-id"></h3>
                <table class="table table-bordered">
                    <tr>
                        <th>Title:</th>
                        <td id="dvd-title"></td>
                    </tr>
                    <tr>
                        <th>Release Year:</th>
                        <td id="dvd-release-year"></td>
                    </tr>
                    <tr>
                        <th>Rating:</th>
                        <td id="dvd-rating"></td>
                    </tr>
                    <tr>
                        <th>Director:</th>
                        <td id="dvd-director"></td>
                    </tr>
                    <tr>
                        <th>Studio</th>
                        <td id="dvd-studio"></td>
                    </tr>
                    <tr>
                        <th>Comments:</th>
                        <td id="dvd-comments"></td>
                    </tr>

                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<!-- Edit Modal -->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"  id="detailsModalLabel">Edit Movie</h4>
            </div>
            <div class="modal-body">
                <h3 id="dvd-id"></h3>
                <form class="form-horizontal" role="form">
                    <div class="form-group">
                        <label for="edit-title" class="col-md-4 control-label">
                            Title:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-title" placeholder="Title">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-release-year" class="col-md-4 control-label">
                            Release Year:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-release-year" placeholder="Release Year">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-rating" class="col-md-4 control-label">
                            Rating:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-rating" placeholder="Rating">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-director" class="col-md-4 control-label">
                            Director:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-director" placeholder="Director">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-studio" class="col-md-4 control-label">
                            Studio:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-studio" placeholder="Studio">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-comments" class="col-md-4 control-label">
                            Comments:
                        </label>
                        <div class="col-md-8">
                            <input type="text" class="form-control" id="edit-comments" placeholder="Comments">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-primary" data-dismiss="modal">
                                Edit Movie
                            </button>
                            <button type="button" class="btn btn-danger" data-dismiss="modal">
                                Cancel
                            </button>
                            <input type="hidden" id="edit-dvd-id">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>