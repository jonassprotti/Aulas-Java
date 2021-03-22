<%-- 
    Document   : resposta
    Created on : 10/03/2021, 21:37:22
    Author     : desktop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nome = "";
    nome = request.getParameter("nome");
    String email = "";
    email = request.getParameter("mail");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página de resposta</h1>
        <p><%=nome%></p>
        <p><%=email%></p>
    </body>
</html>
