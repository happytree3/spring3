<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Film Detail</title>
</head>
<body>
    <h1>Film Detail</h1>
    <p>ID: ${film.filmId}</p>
    <p>Title: ${film.title}</p>
    <p>Description: ${film.description}</p>
    <p>Release Year: ${film.releaseYear}</p>
    <p>Language ID: ${film.languageId}</p>
    <p>Rental Duration: ${film.rentalDuration}</p>
    <p>Rental Rate: ${film.rentalRate}</p>
    <p>Length: ${film.length}</p>
    <p>Replacement Cost: ${film.replacementCost}</p>
    <p>Rating: ${film.rating}</p>
    <a href="<c:url value='/films'/>">Back to List</a>
</body>
</html>