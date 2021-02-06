<html>
<head>
<title>Sistema cadastral de clientes</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
 
<body bgcolor="006699">
<div align="center">
  <p><font color="#FFFFFF" size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Cadastro 
    de Cliente<br>
    </strong></font></p>
  <form name="form1" method="post" action="RespostaInclusaoCliente.jsp">
    <table width="75%" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="25%"><strong><font color="#CCCCCC" size="2" face="Verdana, Arial, Helvetica, sans-serif">RG:</font></strong></td>
        <td width="75%"><input name="identidade" type="text" id="identidade" size="50" maxlength="8"></td>
      </tr>
      <tr> 
        <td><strong><font color="#CCCCCC" size="2" face="Verdana, Arial, Helvetica, sans-serif">CPF:</font></strong></td>
        <td><input name="cpf" type="text" id="cpf" size="50" maxlength="11"></td>
      </tr>
      <tr> 
        <td><strong><font color="#CCCCCC" size="2" face="Verdana, Arial, Helvetica, sans-serif">Nome:</font></strong></td>
        <td><input name="nome" type="text" id="nome" size="50" maxlength="50"></td>
      </tr>
      <tr> 
        <td><strong><font color="#CCCCCC" size="2" face="Verdana, Arial, Helvetica, sans-serif">Endere&ccedil;o:</font></strong></td>
        <td><textarea name="endereco" cols="44" rows="3" id="endereco"></textarea></td>
      </tr>
      <tr> 
        <td><strong><font color="#CCCCCC" size="2" face="Verdana, Arial, Helvetica, sans-serif">Telefone:</font></strong></td>
        <td><input name="telefone" type="text" id="telefone" size="50" maxlength="10"></td>
      </tr>
    </table>
    <p>
      <input type="submit" name="Submit" value="Incluir Cliente">
    </p>
    <p>&nbsp;</p>
  </form>
  <p><strong><font color="#FFFFFF" size="3" face="Verdana, Arial, Helvetica, sans-serif"></font></strong></p>
</div>
</body>
</html>
