<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DVD Library</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <link href="${pageContext.request.contextPath}/css/homeStyle.css" rel="stylesheet">

    </head>
    <body>
        <nav class="navbar navbar-default" style="background-color: orange">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">DVD Library</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}">Home<span class="sr-only">(current)</span></a></li>
                        <li class="active"><a href="addDVD">Add a DVD</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Search By <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">MPAA Rating</a></li>
                                <li><a href="#">Director</a></li>
                                <li><a href="#">Studio</a></li>                           
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Find a DVD Now!">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="http://www.imdb.com">Go to IMDB.com</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="row">
            <!-- This class holds the summary Contact Table-->
            <div class="col-md-6">
                <h2 style="text-align: center">Add A New DVD</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="add-title" class="col-md-4 control-label">
                                Title:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-title" placeholder="Title"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-release-year" class="col-md-4 control-label">
                                Release Year:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-release-year" placeholder="Release Year"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-rating" class="col-md-4 control-label">
                                Rating:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-rating" placeholder="Rating"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-director" class="col-md-4 control-label">
                                Director:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-director" placeholder="Director"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-studio" class="col-md-4 control-label">
                                Studio:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-studio" placeholder="Studio"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="add-comments" class="col-md-4 control-label">
                                Comments:
                            </label>
                            <div class="col-md-8">
                                <input type="text" class="form-control" id="add-comments" placeholder="Comments"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="btn btn-warning btn-lg">Submit DVD</button>
                            </div>
                        </div>
                    </form>
                </div>
            <div class="row">
                <div class="col-md-6">
                    
                </div>
            </div>
            <div class="row">
                <!-- This class holds the summary Contact Table-->
                <div class="col-md-6">
                    <h2 style="text-align: center">Current DVDs</h2>
                    <table id="dvdTable" class="table table-hover col-md-offset-1">
                        <tr>
                            <th width="25%">Title</th>
                            <th width="25%">Release Year</th>
                            <th width="20%">Director</th>
                            <th width="15%"></th>
                            <th width="15%"></th>
                        </tr>
                        <tbody id="contentRows">

                        </tbody>
                    </table>
                </div>
                
                <%@include file="detailsEditModalFragment.jsp" %>
                
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
            <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
            <script src="${pageContext.request.contextPath}/js/dvdLibrary.js"></script>

    </body>
</html>
