<%--
  Created by IntelliJ IDEA.
  User: Lin99
  Date: 23.12.2019
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Info</title>
</head>
<body>
<jsp:useBean id="book" scope="session" class="example.entities.Book"/>
<jsp:useBean id="author" scope="session" class="example.entities.Author"/>
<h2 align="center">${book.name}</h2>
<a href="index">Go to main page </a>

<table>
    <tr>
        <td> <h5>Book Info</h5> </td>
        <td> <h5 align="center"> Summery </h5></td>
    </tr>
    <tr>
        <td> year :${book.year}
        author name: ${author.firstName} ${author.lastName}
        </td>
        <td>${book.summary}</td>
    </tr>
</table>


</body>
</html>
