<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Film Form</title>
</head>
<body>
    <h1>${film.filmId == null ? 'Add New Film' : 'Edit Film'}</h1>
    <form:form modelAttribute="film" method="post">
        <div>
            <form:label path="title">Title:</form:label>
            <form:input path="title"/>
        </div>
        <div>
            <form:label path="description">Description:</form:label>
            <form:textarea path="description"/>
        </div>
        <div>
            <form:label path="releaseYear">Release Year:</form:label>
            <form:input path="releaseYear" type="number"/>
        </div>
        <div>
            <form:label path="languageId">Language ID:</form:label>
            <form:input path="languageId" type="number"/>
        </div>
        <div>
            <form:label path="rentalDuration">Rental Duration:</form:label>
            <form:input path="rentalDuration" type="number"/>
        </div>
        <div>
            <form:label path="rentalRate">Rental Rate:</form:label>
            <form:input path="rentalRate" type="number" step="0.01"/>
        </div>
        <div>
            <form:label path="length">Length:</form:label>
            <form:input path="length" type="number"/>
        </div>
        <div>
            <form:label path="replacementCost">Replacement Cost:</form:label>
            <form:input path="replacementCost" type="number" step="0.01"/>
        </div>
        <div>
            <form:label path="rating">Rating:</form:label>
            <form:select path="rating">
                <form:option value="G">G</form:option>
                <form:option value="PG">PG</form:option>
                <form:option value="PG-13">PG-13</form:option>
                <form:option value="R">R</form:option>
                <form:option value="NC-17">NC-17</form:option>
            </form:select>
        </div>
        <input type="submit" value="${film.filmId == null ? 'Add Film' : 'Update Film'}"/>
    </form:form>
</body>
</html>