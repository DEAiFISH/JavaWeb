<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/5
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="file.jsp" %>--%>
<%--<jsp:include page="file.jsp"/>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> hello </h1>
<br

<%--<%--%>
<%--    request.setAttribute("a", 10);--%>
<%--%>--%>

<%--<jsp:forward page="file.jsp">--%>
<%--    <jsp:param name="user" value="123"/>--%>
<%--</jsp:forward>--%>


<%--<input type="submit" value="word" name="submit">--%>
<%--<input type="submit" value="excel" name="submit">--%>

<%--<%--%>
<%--    String str = request.getParameter("submit");--%>
<%--    if ("word".equals(str)) {--%>
<%--        response.setContentType("application/msword");--%>
<%--    } else if ("excel".equals(str)) {--%>
<%--        response.setContentType("application/vnd.ms-excel");--%>
<%--    }--%>
<%--%>--%>

<%
    //    response.setHeader("refresh", "5;url=file.jsp");
    response.sendRedirect("file.jsp");
%>
</body>
</html>
