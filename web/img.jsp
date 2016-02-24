<%-- 
    Document   : img
    Created on : Feb 23, 2016, 7:52:27 AM
    Author     : Ravindu
--%>

<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String url = "jdbc:mysql://localhost:3306/test01";
            String username = "root";
            String password = "";
            Connection con = null;
            PreparedStatement pst = null;
            //ResultSet rst = null;
            File img = new File(request.getParameter("img"));
            FileInputStream fs = new FileInputStream(img);
            String querry = "insert into test01.img value(?,?)";

            try {
                con = (Connection) DriverManager.getConnection(url, username, password);//get the connection 
                pst = (com.mysql.jdbc.PreparedStatement) 
                con.prepareStatement(querry);
                pst.setInt(2, 4);
               pst.setBinaryStream(1, (InputStream) fs);
                pst.executeUpdate();
                //
            } catch (Exception e) {
                System.out.println("1" + e);
            }

        %>
    </body>
</html>
