<%-- 
    Document   : signupdetailset
    Created on : Feb 22, 2016, 10:04:28 AM
    Author     : Ravindu
--%>

<%@page import="Database.DB"%>
<%@page import="Database.SignupDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <%
            String signup = request.getHeader("btnSignUp");//request.getParameter("btnSignUp");
            out.println(signup);
            out.println("1");

            if (signup == "Sign Up") {
                out.println("2");
                /*DB db = new DB();
                //SignupDetails sign = new SignupDetails();
                db.signd.setFIRST_NAME(request.getParameter("FirstName"));
                db.signd.setLAST_NAME(request.getParameter("LastName"));
                db.signd.setEMAIL(request.getParameter("Email"));
                db.signd.setGENDER(request.getParameter("gender"));
                db.signd.setPASSWORD(request.getParameter("ConfirmPass"));
                String bday = request.getParameter("birthday_day") + "/" + request.getParameter("birthday_month") + "/" + request.getParameter("birthday_year"); // dd/mm/yyyy
                db.signd.setBIRTH_DAY(bday);
                db.signUp();
                response.sendRedirect("index.jsp");*/
            }
            out.println("3");
                            //response.sendRedirect("index.jsp");

        %>
    </body>
</html>
