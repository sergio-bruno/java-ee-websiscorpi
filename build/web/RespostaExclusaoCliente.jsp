<%@ page import="java.sql.*,siscorpi.pedido.*,siscorpi.cliente.*" %>
<% 
  String rg;
  rg = request.getParameter("identidade");
%>
<%! Pedido fachada = new Pedido(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sistema cadastral de clientes</title>
    </head>
    <body bgcolor="006699">
    <div align="center"><font color="#FFFFFF"><strong><font size="3" face="Verdana, Arial, Helvetica, sans-serif"> 
    <%
        try{
            fachada.removerCliente(rg);
    %>    
    <jsp:forward page="index.jsp" />
    <%
        }
        catch (ClienteNaoEncontradoException ex) 
        {
    %>    
    Cliente não encontrado !    
    <%    
        }
    %>
</font></strong></font> </div>
</body>
</html>

  