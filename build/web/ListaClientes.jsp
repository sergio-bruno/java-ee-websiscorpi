<%@ page import="java.sql.*,siscorpi.pedido.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Listagem de Clientes</title>
    </head>
    <body bgcolor="006699">
<p><font color="#FFFFFF" size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Lista de Clientes</strong></font></p>
<%! Pedido fachada = new Pedido(); %>
<table border='0'>
            <%  ResultSet rs = fachada.listarCliente("SELECT RG,CPF,NOME,ENDERECO,TELEFONE From clientes"); %>
                <tr bgcolor="#0099CC">
                    <td width='50'><font size="2" color="#FFFFFF" face="Verdana"><strong>RG</strong></font></td>
                    <td width='50'><font size="2" color="#FFFFFF" face="Verdana"><strong>CPF</strong></font></td>
                    <td width='200'><font size="2" color="#FFFFFF" face="Verdana"><strong>Nome</strong></font></td>
                    <td width='200'><font size="2" color="#FFFFFF" face="Verdana"><strong>Endere&ccedil;o</strong></font></td>
                    <td width='50'><font size="2" color="#FFFFFF" face="Verdana"><strong>Telefone</strong></font></td>
                </tr>
            <% while(rs.next()) {%>	       
                <tr bgcolor="#E7FAED">
                    <td width='50' ><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("rg") %></font></td>
                    <td width='50'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("cpf") %></font></td>
                    <td width='200'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("nome") %></font></td>
                    <td width='200'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("endereco") %></font></td>
                    <td width='50'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= rs.getString("telefone") %></font></td>
                </tr>
            <%}%>
        </table><br>  
    </body>
</html>
