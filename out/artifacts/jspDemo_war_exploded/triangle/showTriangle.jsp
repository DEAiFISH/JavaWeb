<%@ page import="bean.Triangle" %><%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/28
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结算</title>
</head>
<body>
<jsp:useBean id="triangle" class="bean.Triangle" scope="session"/>
<jsp:setProperty name="triangle" property="*"/>

<h3>三角形的三边是：</h3>
边A：
<jsp:getProperty name="triangle" property="a"/>
<br>
边B：
<jsp:getProperty name="triangle" property="b"/>
<br>
边C：
<jsp:getProperty name="triangle" property="c"/>

<br/><br/>

<h3>这三条边能构成三角形吗？</h3>&nbsp;
<%boolean flag = triangle.isTrue();%>
<%=flag%>
<br/>
<h3>面积是：</h3>
<%
    if (flag) {
        out.print(triangle.area());
    } else {
        out.print("错误...");
    }
%>
</body>
</html>
