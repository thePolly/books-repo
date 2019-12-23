<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lin99
  Date: 23.12.2019
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library</title>
</head>
<body>
<h2 align="center">Mysterious Books List</h2>
<br>
<a href="index">Go to main page</a>




<table align="center">
    <thead>

    <th>Book Name</th>
    <th>Year</th>
    <th>Author Name</th>
    <th>Linl</th>
    </thead>
    <tbody>
    <c:forEach items="${bookslist}" var="book">
        <jsp:useBean id="book" scope="session" class="example.entities.Book"/>
        <jsp:useBean id="Author" scope="session" class="example.entities.Author"/>
        <tr>
            <td>${book.name}</td>
            <td>${book.year}</td>
            <td>${book.author.firstName} ${book.author.lastName}</td>
            <td> <a href="moreinfo?id=${book.bookId}">More Info</a></td>>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
