<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Company Contacts</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/starter-template.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <h1>Company Contacts</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search Contacts</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Contact Stats</a></li>
                </ul>    
            </div>

            <div class="row">
                <!-- This class holds the summary Contact Table-->
                <div class="col-md-6">
                    <h2>My Contacts</h2>
                    <table id="contactTable" class="table table-hover">
                        <tr>
                            <th width="40%">Contact Name</th>
                            <th width="30%">Company</th>
                            <th width="15%"></th>
                            <th width="15%"></th>
                        </tr>
                        <tbody id="contentRows">

                        </tbody>
                    </table>
                </div>

                <!-- This holds the new Contact form-->
                <div class="col-md-6">
                    <h2>New Contact Form</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-first-name" class="col-md-4 control-label">
                                First Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-first-name" placeholder="First Name"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-last-name" class="col-md-4 control-label">
                                Last Name:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-last-name" placeholder="Last Name:"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-company" class="col-md-4 control-label">
                                Company:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-company" placeholder="Company"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-email" class="col-md-4 control-label">
                                Email:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-email" placeholder="Email"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-phone" class="col-md-4 control-label">
                                Phone:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-phone" placeholder="Phone"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="btn btn-primary btn-lg">Create Contact</button>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
                <!-- DETAILS MODAL -->
                
                <div class="modal fade" id="detailsModal" tabindex="-1" role="dialog" aria-labeledby="detailsModalLabel" aria-hidden="true">
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
                                        <th>Company</th>
                                        <td id="contact-company"></td>
                                    </tr>
                                    <tr>
                                        <th>Email</th>
                                        <td id="contact-email"></td>
                                    </tr>
                                    <tr>
                                        <th>Phone</th>
                                        <td id="contact-phone"></td>
                                    </tr>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div> 
                </div>
                
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/contactList.js"></script>
    </body>

</html>
