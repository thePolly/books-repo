<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lin99
  Date: 21.12.2019
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="index">Go to main page</a>

<table align="center">
    <thead>
    <th>First name</th>
    <th>Last name</th>
    </thead>
    <tbody>
    <c:forEach items="${authors1}" var="teacher">
        <jsp:useBean id="teacher" scope="page" class="example.entities.Author"/>
        <tr>
            <td>${teacher.firstName}</td>
            <td>${teacher.lastName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>>


</body>
</html>
