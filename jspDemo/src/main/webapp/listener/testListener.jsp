<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/10/31
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    session.setAttribute("10", "20");
    session.removeAttribute("10");
%>
</body>
</html>
