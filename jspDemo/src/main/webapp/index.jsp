<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/5
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="file.jsp" %>--%>
<jsp:include page="file.jsp"/>
<html>
<head>
    <title>Title</title>

    <style>
        table {
            /*color: red;*/
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h1> hello </h1>
<br
        1111
<jsp:forward page="file.jsp">
    <jsp:param name="user" value="123"/>
</jsp:forward>

</body>
</html>
