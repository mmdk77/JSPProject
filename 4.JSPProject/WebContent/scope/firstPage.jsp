<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//page영역
	pageContext.setAttribute("page","pageScope");

	//request 영역
	request.setAttribute("request","RequestScope");
	
	//session 영역
	session.setAttribute("session","sessionScope");
	
	//application 영역
	application.setAttribute("application","applicationScope");
	
	//페이지 이동
	//1. 리다이렉트 방식 -기존의 request가 유지X
	response.sendRedirect("secondPage.jsp");
	
	//2. 포워드 방식 - 서버내에서의 이동 
	//RequestDispatcher requestDispatcher = request.getRequestDispatcher("secondPage.jsp");
	
%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
	<h1>첫번째 페이지</h1>
	<hr>
	page 영역 : <%= pageContext.getAttribute("page") %><br>
	request 영역 : <%= request.getAttribute("request") %><br>
	session 영역 : <%= session.getAttribute("session") %><br>
	application 영역 : <%= application.getAttribute("application") %><br>
		
	</body>
</html>