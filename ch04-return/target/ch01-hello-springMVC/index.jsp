<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<script type="text/javascript" src="js/jquery-3.5.1.jar"></script>
    <script type="text/javascript">
$(function(){
        $("button").click(
        function()
        {
<%--            alert("button click")--%>
$.ajax(
{
    url:"returnVoid-ajax.do",
    data:{
    name:"zhangsan"
    age:20
    },
    type:"post",
    dataType:"json",
}
)
        }
        )
})
    </script>
</head>
<body>
<p>处理器方法返回string表示视图名称</p>
<br/>
<form action="returnString-view.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交参数">
</form>
<%--视图完整路径--%>
<br/>
<form action="returnString-view2.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交参数">
</form>
<br/>
<button id="btn">发起ajax请求</button>
</body>
</html>
