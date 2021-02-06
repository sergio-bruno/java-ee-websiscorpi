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
        <p>
            <%  
            try {
                Cliente clienteSelecionado = fachada.procurarCliente(rg);
            %>
                <font size="3" color="#FFFFFF" face="Verdana"><strong>Informações cadastrais:</strong></font>
                <table border='0'>
                <tr bgcolor="#0099CC">
                    <td width='100'><font size="2" color="#FFFFFF" face="Verdana"><strong>RG</strong></font></td>
                    <td width='100'><font size="2" color="#FFFFFF" face="Verdana"><strong>CPF</strong></font></td>                    
                    <td width='250'><font size="2" color="#FFFFFF" face="Verdana"><strong>Nome</strong></font></td>
                    <td width='250'><font size="2" color="#FFFFFF" face="Verdana"><strong>Endereço</strong></font></td>
                    <td width='100'><font size="2" color="#FFFFFF" face="Verdana"><strong>Telefone</strong></font></td>
                </tr>
                <tr bgcolor="#E7FAED">
                    <td width='100' ><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= clienteSelecionado.getRg() %></font></td>
                    <td width='100' ><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= clienteSelecionado.getCpf() %></font></td>
                    <td width='250'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= clienteSelecionado.getNome() %></font></td>
                    <td width='250'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= clienteSelecionado.getEndereco() %></font></td>
                    <td width='100'><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><%= clienteSelecionado.getTelefone() %></font></td>
                </tr>
                </table><br>
            <%
            }
            catch (ClienteNaoEncontradoException ex) 
            {
            %> 
            <script>    
            alert(" Cliente não encontrado ! ")
            </script>
            <% } %>
    </body>
</html>
