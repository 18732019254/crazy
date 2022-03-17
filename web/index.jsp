<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/9/16
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/con/ae" method="post">
        xh:<input type="text" name="xh"/><br/>
        id:<input type="text" name="id"/><br/>
        bj:<input type="text" name="bj"/><br/>
        age:<input type="text" name="age"/><br/>
        name:<input type="text" name="name"/><br/>
        sex:<input type="text" name="sex"/><br/>
        soccer:<input type="text" name="soccer"/><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
