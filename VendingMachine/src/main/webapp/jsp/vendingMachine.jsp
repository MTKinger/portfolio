<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Vending Machine</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/css/machineStyle.css" rel="stylesheet">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="jumbotron" style="background-color: #000000; text-align: center">
            <h1 style="color:#d3a625">Please Insert Money and Make a Selection!!!</h1>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-9 col-md-offset-2">
                    <div class="row">
                        <div class="col-md-offset-2 col-md-7" style="padding-left: 65px">
                            <div class="btn-group" role="group" aria-label="...">
                                <button type="button" class="btn btn-default" style="background-color: #d3a625" id="dollarIn">$1.00</button>
                                <button type="button" class="btn btn-default" style="background-color: #d3a625" id="quarterIn">$0.25</button>
                                <button type="button" class="btn btn-default" style="background-color: #d3a625" id="dimeIn">$0.10</button>
                                <button type="button" class="btn btn-default" style="background-color: #d3a625" id="nickleIn">$0.05</button>
                                <button type="button" class="btn btn-default" style="background-color: #d3a625" id="pennyIn">$0.01</button>
                            </div>
                        </div>
                        <div class="col-md-9 col-md-offset-2">
                            <div class="row">
                                <div class="col-md-offset-3 col-md-2">
                                    <div class="row">
                                        <h4 style="color: black; text-align: center"><strong>Current Funds:</strong></h4>
                                    </div>
                                    <div class="row">
                                        <h4 style="color: black; text-align: center"><strong id="moneyIn">$1.50</strong></h4>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-10"
                                     <br>
                                    <hr style="border-color: black; border-style: groove">
                                    <br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="img/snickers.jpg" alt="Snickers">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/reeces-pieces.jpg" alt="Reece's Pieces">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/oreo.jpg" alt="Oreos">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color: #d3a625; border-color: #740001">$0.75</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$0.90</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$1.00</button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10"
                                     <br>
                                    <hr style="border-color: black; border-style: groove">
                                    <br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="img/take5.jpg" alt="Take 5">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/famousAmos.jpg" alt="Famous Amos">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/mms.jpg" alt="M&M's">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color: #d3a625; border-color: #740001">$1.25</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$1.50</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$0.65</button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10"
                                     <br>
                                    <hr style="border-color: black; border-style: groove">
                                    <br>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="img/swedishFish.jpg" alt="Take 5">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/doritos.jpg" alt="Famous Amos">
                                </div>
                                <div class="col-md-4">
                                    <img src="img/juniorMints.jpg" alt="M&M's">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color: #d3a625; border-color: #740001">$0.85</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$1.10</button>
                                </div>
                                <div class="col-md-4" style="padding-left: 35px">
                                    <button type="button" class="btn btn-default" style="background-color:  #d3a625; border-color: #740001">$0.55</button>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10"
                                     <br>
                                    <hr style="border-color: black; border-style: groove">
                                    <br>
                                </div>
                            </div>
                        </div>
                    </div>
                    </body>

                    <script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
                    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
                    </html>
