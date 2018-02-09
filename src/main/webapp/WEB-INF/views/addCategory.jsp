<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elevitchi
  Date: 11/22/2017
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Category</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="/WEB-INF/css/style.css">


</head>
<body>
<h1>Add Category</h1>

<form:form method="post" commandName="category" class="form-horizontal">
    <div class="form-group">
        <label for="categoryname" class="col-sm-2 control-label">Name:</label>
        <div class="col-sm-10">
            <form:input path="categoryname" cssClass="form-control"/>
        </div>
    </div>

    <div class="form-group">
        <label for="description" class="col-sm-2 control-label">Description:</label>
        <div class="col-sm-10">
            <form:input path="description" cssClass="form-control"/>
        </div>
    </div>

        <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form:form>




</body>
<a href="category">Category</a>
</html>
