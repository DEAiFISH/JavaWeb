<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/12
  Time: 09:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
<form action="server.jsp" method="post">
    姓名：<input type="text" name="userName"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit">
</form>


</body>
</html>
