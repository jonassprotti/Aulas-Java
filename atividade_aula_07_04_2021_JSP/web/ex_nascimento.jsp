<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.Suporte"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!  
    String nome;
    String nasc;
    String diaSemana;
%>
<%
    this.nome = request.getParameter("nome");
    this.nasc = request.getParameter("nasc");
    if (this.nasc != null){
        this.diaSemana = Suporte.getDiaDaSemana(nasc);
    }
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method ="GET">
            <pre>
                  Nome:               <input type="text" name="nome">
                  Data de Nascimento: <input type="date" name="nasc">
                                      <input type="submit" name="Enviar">
            </pre>
        </form>
        <%
            if(this.nome != null){%>
        <hr>
        <pre>
                 Nome:                        <%=this.nome%>
                 Nascimento:                  <%=this.nasc%>
                 Dia da semana do nascimento: <%=this.diaSemana%>
        </pre>
        <%}%>
    </body>
</html>
