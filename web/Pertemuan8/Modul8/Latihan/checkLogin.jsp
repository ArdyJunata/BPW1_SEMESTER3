<%-- 
    Document   : checkLogin
    Created on : Oct 28, 2019, 4:15:21 PM
    Author     : Lab330-29
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
    if(username.equals("ardy") && password.equals("123")) {
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("login.html");
    }

%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
</html>
