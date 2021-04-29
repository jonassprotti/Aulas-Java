<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="finan" scope="request" class="model.Financeiro" />
<jsp:setProperty name="finan" property="*" />
 
<!DOCTYPE html>
<html>
    <head>
        <title>Investimentos para viagem</title>
    </head>
    <body>
        <pre>
            Você informou: 
            ---------------------------------------------------
            Valor futuro: <%= finan.getValorFuturo()%>
            Meses:        <%= finan.getMeses()%>
            Taxa:         <%= finan.getTaxa()%>
            Você deve investir <%= finan.getInvestimentoMes()%> por mês
            ---------------------------------------------------
        </pre>
    </body>
</html>