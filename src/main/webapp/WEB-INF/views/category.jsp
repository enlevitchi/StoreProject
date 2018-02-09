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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="/WEB-INF/css/style.css">

</head>
<body>
<header>

</header>


<div class="container">
<table class="table table-hover">
    <thead>
    <tr>
        <th>id</th>
        <th>Category</th>
        <th>Description</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCategory}" var="category">
        <tr>
            <td>${category.getcategoryid()}</td>
            <td>${category.getcategoryname()}</td>
            <td>${category.getdescription()}</td>
            <td><a href="<c:url value='/edit/${category.getcategoryid()}'/>">Edit</a></td>
            <td><a href="<c:url value='/delete/${category.getcategoryid()}'/>">Delete</a></td>



        </tr>
    </c:forEach>
    </tbody>
</table>
</div>


<a href="/category/add">Add Category</a>

</body>
</html>
