<%-- 
    Document   : olahLogin
    Created on : Oct 28, 2019, 4:19:09 PM
    Author     : Lab330-29
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int status = 1;
    status = Integer.parseInt(request.getParameter("status"));
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            if (status == 1) {
        %>
        <h1 style="color: red;">LOGIN ERROR !!</h1>
        <%
            }
        %>
        <%@include file="login.html" %>
    </body>
</html>
