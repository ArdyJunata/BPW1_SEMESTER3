<%-- 
    Document   : OlahGet
    Created on : Oct 21, 2019, 3:11:41 PM
    Author     : Lab330-29
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% int angka = Integer.parseInt(request.getParameter("no"));
int angka2 = angka * angka;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pengolahan Get</title>
    </head>
    <body>
        <h3>Data yang dikirmkan dari halaman CobaGet.html adalah <%=angka%></h3>
        <h3>Dan hasil kuadratnya adalah <%=angka2%></h3>
    </body>
</html>
