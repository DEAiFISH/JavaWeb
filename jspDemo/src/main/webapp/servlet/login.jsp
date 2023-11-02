<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/10/10
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login_1" method="post">
    <label>
        用户名：
        <input type="text" name="userName">
    </label><br>
    <label>
        密码：
        <input type="password" name="password">
    </label><br>
    <input type="submit">
</form>
</body>
</html>
