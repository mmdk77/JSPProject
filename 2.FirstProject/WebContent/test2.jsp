<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET</h1>
<form  action="HelloServlet">

	이름 : <input type = "text" name="name"><br>
	ID : <input type = "text" name="ID"><br>
	Password : <input type = "password" name="pwd"><br>
	
	<input type="submit" value="GET방식요청">
	
</form>

<a href="HelloSevlet">으라차차차 - GET</a>

<hr>

<h1>POST</h1>
<form method="post" action="HelloServlet">
	
	이름 : <input type = "text" name="name"><br>
	ID : <input type = "text" name="ID"><br>
	Password : <input type = "password" name="pwd"><br>
	
	<input type="submit" value="POST방식요청">

</form>

<hr>

<h1>JSP</h1>
<form action="test3.jsp">
	
	이름 : <input type = "text" name="name"><br>
	ID : <input type = "text" name="ID"><br>
	Password : <input type = "password" name="pwd"><br>
	
	<input type="submit" value="JSP 요청">

</form>
</body>
</html>