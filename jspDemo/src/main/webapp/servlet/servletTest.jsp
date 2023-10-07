<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/10/7
  Time: 08:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!--
  前端路径必须要加 /
  后端路径不需要加

  servlet处理属于后端操作
-->

<a href="${pageContext.request.contextPath}/servletTest">servlet-跳转</a>

<hr>

<form action="${pageContext.request.contextPath}/servletTest" method="post">
    <h3>POST</h3>
    <label>
        用户名：
        <input type="text" name="user"/>
    </label><br/>
    <label>
        密码：
        <input type="password" name="passwd"/>
    </label><br>
    <input type="submit"/>
</form>
<br>

<form action="${pageContext.request.contextPath}/servletTest" method="get">
    <h3>GET</h3>
    <label>
        用户名：
        <input type="text" name="user"/>
    </label><br/>
    <label>
        密码：
        <input type="text" name="passwd"/>
    </label><br/>
    <input type="submit"/>
</form>

</body>
</html>
