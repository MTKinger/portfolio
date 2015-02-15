<%-- 
    Document   : factorizerForm
    Created on : Feb 14, 2015, 12:32:30 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Factorizer</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/starter-template.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

        <link href="${pageContext.request.contextPath}/css/sitemap.css" rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <div class = "container-fluid">    
                <div id = "firstdiv">
                    <p id = "title" style="font-family: verdana; font-size: 40px">Software Craftsmanship Guild Java Cohort<p>
                    <p id = "titleexplanation">JSP Site Lab<p>
                </div>
            </div>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/hello/sayhi">Hello Controller</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayLuckySevensForm">Lucky Sevens</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayFactorizerForm">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayInterestCalculatorForm">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayFlooringCalculatorForm">Flooring Calculator</a></li>
                </ul>    
            </div>
            <h2>What number would you like to factor?</h2>
            <form action="factorNumber" method="POST">
                <input type="text" name="numberToFactor">
                <input type="submit" value="Factor Number!!!">
            </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
