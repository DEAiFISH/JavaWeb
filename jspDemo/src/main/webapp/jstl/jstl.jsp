<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/11/16
  Time: 08:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--JSTL 必须写--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:out value="输出的内容" default="默认值"/>
<c:out value="输出内容">
    默认值
</c:out>

<c:set value="value" var="varName" scope="request"/>
<%
    request.setAttribute("varName","value");
%>

<c:remove var="var" scope="request"/>
<%
    request.removeAttribute("varName");
%>

<c:if test="条件表达式">
    主体内容
</c:if>

<c:choose>
    <c:when test="条件表达式1">
        主体内容1
    </c:when>
    <c:when test="条件表达式2">
        主体内容2
    </c:when>
    <c:when test="条件表达式3">
        主体内容3
    </c:when>
    <c:otherwise>
        表达式都不正确时，执行的主体内容
    </c:otherwise>
</c:choose>

<:c:forEach var="变量名" items="数组或Collection对象">
    循环体
</:c:forEach>

<c:forTokens items="要迭代的String对象" delims="指定分割字符串的分割符">
    循环体
</c:forTokens>

<c:url value="../index.jsp">

</c:url>

<c:redirect url="jstl.jsp">

</c:redirect>
<jsp:forward page="jstl.jsp">

</jsp:forward>
<%
    request.getRequestDispatcher("jstl.jsp");
    response.sendRedirect("jstl.jsp");
%>

<c:import url="../index.jsp"/>


${fn:contains("abcd", "ab")}    <%--包含--%>
${fn:containsIgnoreCase("abcd", "ab")}    <%--包含（忽略大小写）--%>

${fn:endsWith("abcd", "cd")}    <%--以什么结束--%>
${fn:startsWith("abcd", "cd")}    <%--以什么开始--%>

${fn:indexOf("abdd", "d")}  <%--在字符串中的位置--%>

<%
    String[] arr = new String[]{"a","b","c"};
    request.setAttribute("arr",arr);
%>
${fn:join(arr, ";")}

${fn:split("a.b.c.d", ".")} <%--字符串分割--%>

${fn:length("123456")}  <%--字符串长度--%>

${fn:replace("awe", "w", "k")}    <%--替换字符串--%>

${fn:substring("abcdef", 2, 5)} <%--截取字符串--%>
${fn:substringBefore("abcd", "c")} <%--截取某个字符之前的字符串--%>
${fn:substringAfter("abcdef", "c")} <%--截取某个字符之后的字符串--%>

${fn:toLowerCase("ADAbd")}  <%--转为小写--%>
${fn:toUpperCase("ADAbd")}  <%--转为大写--%>

${fn:trim("   fdsfsdf   ")} <%--去除字符串前后空格--%>
</body>
</html>
