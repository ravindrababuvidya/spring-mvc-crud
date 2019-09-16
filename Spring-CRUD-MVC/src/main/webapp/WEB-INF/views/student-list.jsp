<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Details</h1>
	<br>
	
	<table>
		<tr><td>First Name</td><td>Last Name</td><td>Email</td> </tr>
		<c:forEach var="student" items="students">
			<tr>
				<td>${student.firstname }</td>
				<td>${student.lastname }</td>
				<td>${student.email }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>