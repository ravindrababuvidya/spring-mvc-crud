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
	<input type="button" name="Add Student " value="Add Student" onclick="window.location.href='showStudentForm';return false; "/>
	<table>
		<tr><th>First Name</th><th>Last Name</th><th>Email</th> <th>Action</th> </tr>
		<c:forEach var="student" items="${students }">
			<c:url var="updatelink"  value="/student/showformupdateStudent">
				<c:param name="studentId" value="${student.id }"></c:param>
			</c:url>
			<tr>
				<td>${student.firstname }</td>
				<td>${student.lastname }</td>
				<td>${student.email }</td>
				<td ><a href="${updatelink}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

<script>
	function updateData(){
		//alert("Hi");
		}
</script>