<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Form</h1>
	<form:form action="addStudent" modelAttribute="student" method="POST">
		First Name :<form:input path="firstname" /><br>
		Last Name :<form:input path="lastname" /><br>
		Email <form:input path="email" /><br>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>