<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/11/16
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="triangle" class="bean.Triangle" scope="request"/>
<c:set target="${triangle}" property="a" value="${sessionScope.len[0]}"/>
<c:set target="${triangle}" property="b" value="${sessionScope.len[1]}"/>
<c:set target="${triangle}" property="c" value="${sessionScope.len[2]}"/>
<h3>三角形的三边是：</h3>
边A：${triangle.a}
<br>
边B：${triangle.b}
<br>
边C：${triangle.c}


<br/><br/>

<h3>这三条边能构成三角形吗？</h3>&nbsp;
<c:if test="${triangle.a + triangle.b > triangle.c && triangle.b + triangle.c > triangle.a && triangle.c + triangle.a > triangle.b}">
    <h3>true</h3>
</c:if>
<c:if test="${triangle.a + triangle.b <= triangle.c || triangle.b + triangle.c <= triangle.a || triangle.c + triangle.a <= triangle.b}">
    <h3>false</h3>
</c:if>
<br/>
<h3>周长是：</h3>
<h3>${triangle.a + triangle.b + triangle.c}</h3>

</body>
</html>
