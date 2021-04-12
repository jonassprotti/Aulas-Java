<%@page import="model.Aluno"%>
<%
    Aluno a = new Aluno();
    a = (Aluno) request.getAttribute("aluno");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reposta Cadastro</title>
    </head>
    <body>
        <h1>Reposta Cadastro - (Servlet)!</h1>
            <pre>
Nome:     <%=a.getNome()%>
Nota 1:   <%=a.getNota1()%>
Nota 2:   <%=a.getNota2()%>
Média:    <%=a.getMedia()%>
Situação: <%=a.getSituacao()%>
<input type="button" value="Voltar" onclick="history.go(-1)">
           </pre>
    </body>
</html>
