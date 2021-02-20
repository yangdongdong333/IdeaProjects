<%--
  Created by IntelliJ IDEA.
  User: 13915
  Date: 2021/2/7
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>redirect.jsp</title>
</head>
<body>

<h3>从redirect.jsp中利用param取值</h3>
<h3>myname数据：${param.myname}</h3> <br/>
<h3>myage：${param.myage}</h3>
<h3>取参数：<%=request.getParameter("myname")%></h3>
</body>
</html>
