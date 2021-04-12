<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    private String horaAtual() {
        Date ja = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
        return sdf.format(ja);
    }
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EXEMPPLO DE JPS</h1>
        <p>Hora certa: <%=horaAtual()%> </p>
        <%
        String endereco = request.getRemoteAddr();
        out.print(endereco);
        %>
    </body>
</html>