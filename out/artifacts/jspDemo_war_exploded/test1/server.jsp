<%@ page import="java.io.IOException" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.Time" %><%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/12
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>server</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    if ("zhangsan".equals(userName) && "123".equals(password)) {
        out.print("<h1>登录成功！</h1>");
        out.print("<p>将在3秒后跳转到<a href=\"loginSuccess.jsp\">成功</a>页面...</p>");
        request.setAttribute("userName", "张三");
        request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
    } else {
        out.print("<h1>账号或密码错误，请重新输入！</h1>");
        out.print("<p>将在3秒后跳转到<a href=\"login_1.jsp\">登录</a>页面...</p>");
        response.setHeader("refresh", "3;login_1.jsp");
    }
%>

</body>
</html>
