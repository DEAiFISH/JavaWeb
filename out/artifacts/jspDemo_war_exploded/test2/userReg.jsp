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
    <title>UserReg</title>
    <link rel="stylesheet" type="text/css" href="css/all.css">
    <script src="js/userReg.js"></script>
    <%
        request.setCharacterEncoding("utf-8");
    %>

</head>
<body>
<h1>用户注册页面</h1>
<hr/>
<form action="login.jsp" method="post" onsubmit=" save()">
    <div>
        <table id="regTable">
            <tr>
                <td class="title">
                    用户名：
                </td>
                <td>
                    <input type="text" name="userName"/>
                </td>
            </tr>
            <tr>
                <td class="title">
                    密码：
                </td>
                <td>
                    <input type="password" name="password"/>
                </td>
            </tr>
            <tr>
                <td class="title">
                    确认密码：
                </td>
                <td>
                    <input type="password" name="password"/>
                </td>
            </tr>
            <tr>
                <td class="title">
                    性别：
                </td>
                <td>
                    <input type="radio" name="gender" value="male"/>男&nbsp;
                    <input type="radio" name="gender" value="female"/>女
                </td>
            </tr>
            <tr>
                <td class="title">
                    爱好：
                </td>
                <td>
                    <input type="checkbox" name="hob" value="计算机"/>计算机&nbsp;
                    <input type="checkbox" name="hob" value="音乐"/>音乐&nbsp;
                    <input type="checkbox" name="hob" value="体育"/>体育&nbsp;
                    <input type="checkbox" name="hob" value="文学"/>文学&nbsp;
                </td>
            </tr>
            <tr>
                <td class="title">
                    星座：
                </td>
                <td>
                    <select name="start">
                        <option value="牡羊座" selected>牡羊座</option>
                        <option value="金牛座">金牛座</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="title">
                    个人简历：
                </td>
                <td>
                    <textarea rows="3" cols="20" name="description" name="description"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交" style="margin-left: 10px"/>
                    <input type="reset" value="重置" style="margin-left:20px"/>
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
