<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/12
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>successful</title>
</head>
<body>
<h1>
    欢迎<%out.print(request.getAttribute("userName"));%>登录成功！！！
</h1>
</body>
</html>
