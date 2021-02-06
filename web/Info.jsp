<%@page import="siscorpi.gui.Info" %>
<HTML>
    <HEAD>
        <TITLE>Créditos do sistema</TITLE>
    </HEAD>
    <BODY BGCOLOR="#00CC99">
        <CENTER>
        <%! Info info = new Info(new java.awt.Frame(), true); %>
        <% 
        info.setSize(420,200);
        info.setLocationRelativeTo(null);
        info.setVisible(true);
        info = null;
        %>
        </CENTER>
    </BODY>
</HTML>