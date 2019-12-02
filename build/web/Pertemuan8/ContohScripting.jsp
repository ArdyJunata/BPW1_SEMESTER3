<%-- 
    Document   : ContohScripting
    Created on : Oct 28, 2019, 1:52:15 PM
    Author     : Lab330-29
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--contoh deklarasi--%>
        <%!
            private int Luas(int sisi) {
                int hasil = sisi * sisi;
                return hasil;
            }
        %>
        <h1>Luas Persegi Empat = <%=Luas(5)%></h1><br>

        <%-- contoh lain penerapan scripting-declaration --%>
        <jsp:declaration>
            private int Luas2(int sisi) {
                int hasil2 = sisi * sisi;
                return hasil2;
            }
        </jsp:declaration>
        <h1>Hasil Luas2 = 
            <jsp:expression>Luas2(5)</jsp:expression>
        </h1>
    </body>
</html>
