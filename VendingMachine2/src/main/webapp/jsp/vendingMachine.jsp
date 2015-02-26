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
        <div class="page-header">
            <h1>Mike's Vending Machine<br> <small>Please Have Your Money Ready!!!</small></h1>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-offset-1 col-md-10" style="padding-left: 50px">
                    <form class="form-inline">
                        <div class="form-group">
                            <label for="exampleInputName2">Snack Number:</label>
                            <input type="text" class="form-control" id="snack-choice" placeholder="Enter a Snack Number!">
                        </div>
                        <button type="submit" class="btn btn-primary" id="purchase-button">Purchase Snack</button>
                        <div class="form-group">
                            <label for="exampleInputEmail2">Please Enter Money:</label>
                            <input type=text class="form-control" id="money-input" placeholder="$0.00">
                        </div>
                        <button type="submit" class="btn btn-success" id="insert-money">Insert Money</button>
                    </form>
                    <br>
                    <h4 style="text-align: center">Current Funds:</h4>
                    <h4 style="text-align: center" id="show-money"></h4>
                    <hr><br>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <table class="table-bordered" id="machine-table">
                        <tbody id="content-rows">
                            <!-- INVENTORY WILL LOAD HERE!!! -->
                        </tbody>
                    </table>
                </div>
                <div class="col-md-7">
                    <h3 style="text-align: center">You Have Received:</h3>
                    <table id="contactTable" class="table table-hover">
                        <tr>
                            <th width = "40%">Snack</th>
                            <th width = "15%">$.25</th>
                            <th width = "15%">$.10</th>
                            <th width = "15%">$.05</th>
                            <th width = "15%">$.01</th>
                        </tr>
                        <tbody id="purchase-history-data">
                            <!--Filled with Purchase History -->
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>

<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/vendingMachine.js"></script>

</html>
