<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%
    
    //---------------------------------------------------
    //회원가입
    //---------------------------------------------------
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    out.print(id);
    //1. JDBC 드라이버 로드
    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    //2.데이터 베이스 연결
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
    
    //3.SQL문 실행
    String sql ="insert into member values('"+id+"','"+pwd+"','홍길동',20,1,'서울시',default)";
    Statement stmt = con.createStatement();
    
    stmt.executeUpdate(sql); //alt + X 와 같은역활 SQL실행
    
    //4.데이터 베이스 연결 끊음
    
    stmt.close();
    con.close();
    
    
    
    
    
    
    %>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
		
	</body>
</html>