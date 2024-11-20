<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Film List</title>
</head>
<body>
    <h1>Film List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Release Year</th>
            <th>Action</th>
        </tr>
        <c:forEach var="film" items="${films}">
            <tr>
                <td>${film.filmId}</td>
                <td><a href="<c:url value='/films/${film.filmId}'/>">${film.title}</a></td>
                <td>${film.releaseYear}</td>
                <td>
                    <a href="<c:url value='/films/edit/${film.filmId}'/>">Edit</a>
                    <a href="<c:url value='/films/delete/${film.filmId}'/>">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value='/films/add'/>">Add New Film</a>
</body>
</html>