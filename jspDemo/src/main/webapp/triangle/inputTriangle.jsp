<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/28
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>输入</title>
</head>
<body>
<h1>输入三角形三边：</h1>
<form action="load.jsp" method="post">
    <label>
        边A：
        <input type="text" name="a"/>
    </label><br/>
    <label>
        边B：
        <input type="text" name="b"/>
    </label><br/>
    <label>
        边C：
        <input type="text" name="c"/>
    </label>
    <label><br/>
        <input type="submit">
    </label><br/>
</form>
</body>
</html>
