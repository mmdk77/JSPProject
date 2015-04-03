<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
	<table border="1">
		<tr>
			<td>getContextPath()</td>	
			<td><%=request.getContextPath() %></td>
		</tr>
		<tr>
			<td>getMethod()</td>	
			<td><%=request.getMethod() %></td> <!-- //get방식 -->
		</tr>
		
		<tr>
			<td>getRequestURL()</td>	
			<td><%=request.getRequestURL() %></td> 
		</tr>
		<tr>
			<td>getRequestURI()</td>	
			<td><%=request.getRequestURI() %></td> 
		</tr>
		<tr>
			<td>getRemoteHost()</td>	
			<td><%=request.getRemoteHost() %></td> 
		</tr>
		<tr>
			<td>getRemoteAddr()</td>	
			<td><%=request.getRemoteAddr() %></td> 
		</tr>
		<tr>
			<td>getRemoteUser()</td>	
			<td><%=request.getRemoteUser() %></td> 
		</tr>
		<tr>
			<td>getServerName()</td>	
			<td><%=request.getServerName() %></td> 
		</tr>
		<tr>
			<td>getProtocol()()</td>	
			<td><%=request.getProtocol() %></td> 
		</tr>
		
		
	</table>
	</body>
</html>