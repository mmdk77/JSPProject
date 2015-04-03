<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
	
	<%
	String name = request.getParameter("name");
	String gender = request.getParameter("nom");
	String[] season = request.getParameterValues("season");
	
	if(gender.equals("남자")){
		response.sendRedirect("http://www.naver.com"); //Redirect 방식 
	}
	else
			response.sendRedirect("http://www.daum.net");
	
	if(season == null){
		out.println("선택하세요");
		}
	else
		for(String str :season){
			out.print(str);
		}
		//for(int a = null;a<season.length;a++){
			
	
	out.println(request.getParameter("yes"));
	out.println(request.getParameter("no"));
	
	%>
	
		
	</body>
</html>