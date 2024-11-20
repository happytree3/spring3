<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!   1111
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- **JSTL **
<form action="<c:url value='/test'/>" method="get">
    <input type="submit" value="Go to Test Page">
</form>
-->

<!-- EL(Expression Language)-->
<form action="${pageContext.request.contextPath}/test" method="get">
    <input type="submit" value="Go to Test Page">
</form>

</body>
</html>