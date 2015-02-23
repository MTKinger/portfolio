<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vending Machine Home</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body style="background-color: #e0eaf3">
        <div class="page-header" style="background-color: #e0eaf3">
            <h1 style="text-align: center; font-family: cursive; color: #e2580b">Mike's Vending Machine<br>
                <small style="color: #f2930c">Please Have Your Money Ready</small></h1>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-offset-4 col-md-5">
                    <div class="btn-group" role="group" aria-label="...">
                        <a href="${pageContext.request.contextPath}/vendingMachine"><button type="button" class="btn btn-success">I'm ready</button></a>
                        <a href="http://www.freecreditreport.com"><button type="button" class="btn btn-warning">I need more money</button></a>
                        <a href="http://www.diabetes.com"><button type="button" class="btn btn-danger">I can't eat candy</button></a>
                    </div>
                </div>
            </div>
        </div>



        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

