<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/11/21
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>π
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadServlet" method="post" enctype="multipart/form-data">
  文件描述：
  <input type="text"><br>
  选择文件：
  <input type="file" name="file1"><br>
  <input type="submit">
</form>
</body>
</html>
