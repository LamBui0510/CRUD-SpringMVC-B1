<%--
  Created by IntelliJ IDEA.
  User: LAM
  Date: 1/10/2022
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

<div class="col-2">
    <div class="form-container">
        <div class="form-btn">

            <span>Edit Customer</span>
            <hr id="Indicator">
        </div>

        <form method="post">
            <input type="text" name="id" value="${customers.id}">
            <input type="text" name="name" value="${customers.name}">
            <input type="text" name="email" value="${customers.email}">
            <input type="text" name="img" value="${customers.img}">
            <button type="submit" class="btn">Edit</button>
        </form>

    </div>
</div>

</body>
</html>
