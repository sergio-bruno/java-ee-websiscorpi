<%@ page import="java.sql.*,siscorpi.pedido.*,siscorpi.cliente.*" %>
<% 
  String rg,cpf,nome,endereco,telefone;
  rg = request.getParameter("identidade");
  cpf = request.getParameter("cpf");
  nome = request.getParameter("nome");
  endereco = request.getParameter("endereco");
  telefone = request.getParameter("telefone");
%>
<%! Pedido fachada = new Pedido(); %>
<%! Cliente clienteSelecionado; %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Sistema cadastral de clientes</title>
    </head>
    <body bgcolor="006699">
    <div align="center"><strong> <font size="2" face="Verdana, Arial, Helvetica, sans-serif"> 
    <%
        try{
        clienteSelecionado = new Cliente(rg,nome,cpf,endereco,telefone);
        
        if ( fachada.existeCliente(clienteSelecionado.getRg()) ) {
    %>        
    Este cliente já esta cadastrado e será atualizado...
    <% }
        fachada.cadastrarCliente(clienteSelecionado);
    %>    
    Cliente cadastrado com êxito...
    <%
        }
        catch (ClienteNaoEncontradoException ex) 
        {
    %>    
    Cliente não encontrado !    
    <%    
        }
    %>
    </font></strong> </div>
</body>
</html>
