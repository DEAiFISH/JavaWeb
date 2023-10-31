<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/14
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
    <link rel="stylesheet" type="text/css" href="css/all.css">
    <%
        request.setCharacterEncoding("utf-8");
    %>
</head>
<body>
<h1>用户信息展示</h1>
<hr/>
<div>
    <table id="infoTable">
        <tr>
            <td class="title">
                用户名：
            </td>
            <td id="userName">
                <%=session.getAttribute("userName")%>
            </td>
        </tr>
        <tr>
            <td class="title">
                密码：
            </td>
            <td id="password">
                <%=session.getAttribute("password")%>
            </td>
        </tr>
        <tr>
            <td class="title">
                确认密码：
            </td>
            <td>
                <%=session.getAttribute("password")%>
            </td>
        </tr>
        <tr>
            <td class="title">
                性别：
            </td>
            <td id="gender">
                <%
                    if ("male".equals(session.getAttribute("gender"))) {
                        out.print("男");
                    } else if ("female".equals(session.getAttribute("gender"))) {
                        out.print("女");
                    }
                %>
            </td>
        </tr>
        <tr>
            <td class="title">
                爱好：
            </td>
            <td id="hob">
                <%
                    for (String hob : (String[]) session.getAttribute("hob")) {
                        out.print(hob + "&nbsp;");
                    }
                %>
            </td>
        </tr>
        <tr>
            <td class="title">
                星座：
            </td>
            <td id="start">
                <%=session.getAttribute("start")%>
            </td>
        </tr>
        <tr>
            <td class="title">
                个人简历：
            </td>
            <td id="description">
                <%=session.getAttribute("description")%>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
