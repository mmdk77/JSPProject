<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	out.print("JSP"); //내장 객체
	
	String name = request.getParameter("name"); //JSP든 Servlet이든 서버에서 값을 받아오는 방법.
	
	out.print("이름 : " + name);


%> <!-- JSP를 사용하면 내장객체를 사용하며 내장객체는 자동으로 Servlet으로 바뀜.  -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <font color="blue"><%= name %></font>
</body>
</html>