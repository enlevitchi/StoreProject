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

<a href="addCategory.jsp">Add Category</a>

</body>
</html>
