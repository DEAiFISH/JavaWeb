<%--
  Created by IntelliJ IDEA.
  User: qingyuan
  Date: 2023/9/14
  Time: 09:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/all.css">
    <script>
        function login() {
            var userName = document.getElementById("userName").value;
            var password = document.getElementById("password").value;
            if (!(userName === <%=session.getAttribute("userName")%>) || !(password === <%=session.getAttribute("password")%>)) {
                alert("账号或者密码错误！！！");
                event.preventDefault()
            }
        }
    </script>
    <%
        request.setCharacterEncoding("utf-8");
        session.setAttribute("userName", request.getParameter("userName"));
        session.setAttribute("password", request.getParameter("password"));
        session.setAttribute("gender", request.getParameter("gender"));
        session.setAttribute("hob", request.getParameterValues("hob"));
        session.setAttribute("start", request.getParameter("start"));
        session.setAttribute("description", request.getParameter("description"));
    %>
</head>
<body>
<h1>用户登录</h1>
<hr/>
<div>
    <form action="info.jsp" method="post" onsubmit="login()">
        <table id="loginTable">
            <tr>
                <td class="title">
                    姓名：
                </td>
                <td>
                    <input type="text" id="userName">
                </td>
            </tr>
            <tr>
                <td class="title">
                    密码：
                </td>
                <td>
                    <input type="password" id="password">
                </td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
