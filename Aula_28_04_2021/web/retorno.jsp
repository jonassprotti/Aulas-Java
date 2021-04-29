<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Investimento para viagem</title>
    </head>
    <body>
        <%
            // obter os dados como string
            String valorFuturos = request.getParameter("valorfuturo");
            String mesesS = request.getParameter ("meses");
            String taxaS = request.getParameter("taxa");
            // Converter para double
            double valorFuturo = Double.parseDouble(valorFuturos);
            Double meses = Double.parseDouble(mesesS);
            Double taxa = Double.parseDouble(taxaS)/100;
            // calcular o depósito mensal
            Double pr = (valorFuturo * taxa) / (Math.pow(1 + taxa, meses)- 1);
            // Formatar para exibição
            DecimalFormat df = new DecimalFormat ("R$ #, ##0.00");
            String prS = df.format(pr);
        %>
        <p>Você deve investir <%= prS%> por mês</p>
    </body>
</html>