<%--
  Created by IntelliJ IDEA.
  User: LAM
  Date: 1/10/2022
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ShowCustomer</title>
</head>
<body>
<h1></h1>
<table border="1">
    <td><button class="bubble-legend-symbol"><a href="/create">Create</a></button></td>
    <c:forEach items="${customers}" var="p" varStatus="loop">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.email}</td>
            <td><img src="${p.img}" width="200" height="150"></td>
            <td><button><a href="/edit?index=${loop.index}">edit</a></button></td>
            <td><button><a href="/delete?index=${loop.index}">delete</a></button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>