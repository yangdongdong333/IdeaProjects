<%--
  Created by IntelliJ IDEA.
  User: 13915
  Date: 2021/2/15
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>

<html>
<head>
    <title>注册学生</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<div align="center"></div>
<form action="student/addStudent.do">
    <table>
        <tr>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
