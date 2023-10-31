<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/14
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
<%
    session.setAttribute("usr", "cxx");
    String usr = (String) session.getAttribute("usr");
    session.removeAttribute("usr");
    session.getCreationTime();
    session.getLastAccessedTime();
    session.getMaxInactiveInterval();
    session.setMaxInactiveInterval(10000);
    session.invalidate();
    session.isNew();
    session.setMaxInactiveInterval(100000);

    application.setAttribute("", "");
%>
</body>
</html>
