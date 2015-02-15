<%-- 
    Document   : flooringCalculatorForm
    Created on : Feb 14, 2015, 3:36:15 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Flooring Calculator</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/css/starter-template.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <!-- Testing custom css reliance -->
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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayFactorizerForm">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayInterestCalculatorForm">Interest Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/displayFlooringCalculatorForm">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/displayTipCalculatorForm">Tip Calculator</a></li>
                </ul>    
            </div>
            <h2>Enter Your Order Info Below</h2>
            <form action="calculateOrder" method="POST">
                <h3>What is the name of the company placing the order?</h3>
                <input type="text" name="companyName">
                <h3>What is the area of the order?</h3>
                <input type="text" name="orderArea">
                <!--                <div class="dropdown">
                                    <br>
                                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                                        State
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Pennsylvania</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Ohio</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Indiana</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Michigan</a></li>
                                    </ul>
                                </div>
                                <br>
                                <div class="dropdown">
                                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
                                        Product
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Wood</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Tile</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Carpet</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Laminate</a></li>
                                    </ul>
                                </div>
                                <br>-->
                <h3>What state are you placing the order from?</h3>
                <input type="text" name="orderState">
                <h3>What product do you wish to order?</h3>
                <input type="text" name="orderProduct">
                <input type="submit" value="Submit Order!!!">
            </form>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
