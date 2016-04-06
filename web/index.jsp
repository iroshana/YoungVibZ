<%-- 
    Document   : index
    Created on : Feb 19, 2016, 7:01:21 PM
    Author     : Ravindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="hide-sidebar ls-bottom-footer" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Welcome to Young VibZ</title>

        <link href="css/vendor/all.css" rel="stylesheet">
        <link href="css/app/app.css" rel="stylesheet">
    </head>
    <body class="login">
        <div id="content">
            <div class="container-fluid">

                <div class="lock-container">
                    <h1>Account Access</h1>
                    <div class="panel panel-default text-center">
                        <img src="images/login.jpg" class="img-circle">
                        <div class="panel-body">
                            <input class="form-control" name="loginemail" type="text" placeholder="Username" required="required" >
                            <input class="form-control" name="loginpassword" type="password" placeholder="Enter Password" required="required" >

                            <a href="homepageset.jsp" class="btn btn-primary">Login <i class="fa fa-fw fa-unlock-alt"></i></a>
                            <a href="signup.jsp" class="forgot-password">Not a Member? Sign Up</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <!-- Footer -->
        <footer class="footer">
            <strong>Young VibZ</strong> v1.0.0 &copy; Copyright 2016</footer>
        <!-- // Footer -->
    </body>
</html>
