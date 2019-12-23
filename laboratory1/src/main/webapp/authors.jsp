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
    <title>Library</title>
</head>
<body>
<h2 align="center">Mysterious Authors List</h2>
<br>
<a href="index">Go to main page</a>
<br>
<table align="center" title="Create new Mysterious Author here">
    <tbody>

    <form action="createAuthor" method="POST">
        <br>
        <tr>
            <td>
                <label>First name</label>
            </td>
            <td>
                <dif>
                    <input type="text" id="firstName" name="firstName" value="author" />
                </dif>
            </td>
        </tr>


        <tr>
            <td>
                <label>Last name</label>
            </td>
            <td>
                <dif>
                    <input type="text" id="lastName" name="lastName" value="author"/>
                </dif>
            </td>
        </tr>

        <tr>
            <td>
                <label>Year of birth</label>
            </td>
            <td>
                <dif>
                    <input type="text" id="yearOfBirth" name="yearOfBirth" value="1950"/>
                </dif>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
            <input type="submit" value="Create"/>
            </td>
        </tr>
    </form>
    </tbody>
</table>
<br>
<table align="center">
    <thead>
    <th> Authors ID (Secret)</th>
    <th>First name</th>
    <th>Last name</th>
    <th>Year of birth</th>
    <th>Delete author</th>
    </thead>
    <tbody>
    <c:forEach items="${authors1}" var="Author">
        <jsp:useBean id="Author" scope="session" class="example.entities.Author"/>
        <tr>
            <td> ${Author.authorId} </td>
            <td>${Author.firstName}</td>
            <td>${Author.lastName} the Mysterious </td>
            <td>${Author.yearOfBirth}</td>
            <td align="center">
                <form action="deleteAuthors" method="POST">
                    <input type="text" id="id" name="id" value="${Author.authorId}" hidden="true"/>
                    <input type="submit" value="Delete"/>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>

</body>
</html>
