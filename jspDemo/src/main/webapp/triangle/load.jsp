<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/11/16
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] len = new String[]{request.getParameter("a"),request.getParameter("b"),request.getParameter("c")};
    session.setAttribute("len",len);
    response.sendRedirect("output.jsp");
%>
</body>
</html>
