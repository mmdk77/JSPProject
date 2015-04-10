<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
	<form action="testLogin.jsp">
	
	<label for="id">아이디 : </label>
	<input type="text" id="id" name="id" value ="test"><br>
	
	<label for="id">패스워드 : </label>
	<input type="text" id="pwd" name="pwd" value ="1234"><br>
	
	<input type = "submit" value="로그인">
	<input type = "reset" value="취소">
	
	</form>
	</body>
</html>