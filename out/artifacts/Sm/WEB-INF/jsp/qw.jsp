<%@ page import="java.util.List" %>
<%@ page import="com.smm.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2021/9/16
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<table>
    <%
        List<User> list=(List<User>) request.getAttribute("list");
        for(User user:list){

    %>

            <tr>
                <td><%=user.getXh()%></td>
                <td><%=user.getId()%></td>
                <td><%=user.getBj()%></td>
                <td><%=user.getAge()%></td>
                <td><%=user.getName()%></td>
                <td><%=user.getSex()%></td>
                <td><%=user.getSoccer()%></td>
            </tr>

    <%
        }
    %>
</table>
</body>
</html>
