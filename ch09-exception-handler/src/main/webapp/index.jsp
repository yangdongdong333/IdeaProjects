<%--
  Created by IntelliJ IDEA.
  User: 13915
  Date: 2021/2/15
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<p>全局异常处理</p>
<form action="some.do" method="post">
    姓名：<input type="text" name="name"> <br/>
    年龄：<input type="text" name="age">  <br/>
    <input type="submit" value="提交请求">
</form>

<
</body>
</html>
