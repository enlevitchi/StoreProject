<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: elevitchi
  Date: 6/6/2017
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Category</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.js">

</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>category</th>
        <th>description</th>
        <th>action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCategory}" var="category">
        <tr>
            <td>${category.getcategoryId()}</td>
            <td>${category.categoryName}</td>
            <td>${category.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

    <table>
<tr>
    <td>${category.getcategoryId()}</td>
    <td>${category.categoryName}</td>
    <td>${category.description}</td>
</tr>
    </table>

<a href="/category/add">Add Category</a>

</body>
</html>
