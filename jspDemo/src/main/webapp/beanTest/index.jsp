<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/26
  Time: 08:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="bean.Student" %>
<html>
<head>
    <title>BEAN</title>
</head>
<body>
<jsp:useBean id="student" class="bean.Student" scope="session">
    <jsp:setProperty name="student" property="name" value="234234"/>
    <jsp:getProperty name="student" property="name"/>
    <jsp:getProperty name="student" property="age"/>
    <jsp:getProperty name="student" property="id"/>
</jsp:useBean>

</body>
</html>
