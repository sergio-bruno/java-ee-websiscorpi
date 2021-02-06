<%@ page import="java.sql.*,siscorpi.pedido.*,java.text.DecimalFormat" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Listagem de Produtos</title>
    </head>
    <body bgcolor="006699">
<p><font color="#FFFFFF" size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Produtos
  disponíveis:</strong></font></p>
<%! Pedido fachada = new Pedido(); %>
<table border='0'>
            <%  DecimalFormat doisDigitos = new DecimalFormat("0.00");
                ResultSet rs = fachada.listarProduto("SELECT Codigo,Descricao,Preco_venda From produto"); %>
                <tr bgcolor="#0099CC">
                    <td width='10'><font size="2" color="#FFFFFF" face="Verdana"><strong>C&oacute;digo</strong></font></td>
                    <td width='350'><font size="2" color="#FFFFFF" face="Verdana"><strong>Descri&ccedil;&atilde;o</strong></font></td>
                    <td width='100'><font size="2" color="#FFFFFF" face="Verdana"><strong>Pre&ccedil;o</strong></font></td>
                </tr>
            <% while(rs.next()) {%>	       
                <tr bgcolor="#E7FAED">
                    <td width='10' ><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("Codigo") %></font></td>
                    <td width='350'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("Descricao") %></font></td>
                    <td width='100' ALIGN="RIGHT"><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= doisDigitos.format(rs.getFloat("Preco_venda")) %></font></td>
                </tr>
            <%}%>
        </table><br>  
    </body>
</html>
