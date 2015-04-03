<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>JSP/Servlet</title>
	</head>
	<body>
	<h1>설문조사</h1>
	<hr>
	
	<form action ="Second.jsp">
	<table border="1">
	<tr>
		<td> 이름:
			<input type="text" id="name">  
		</td>
	</tr>
	
	<tr>
		<td> 성별:
			<input type="radio" name="nom" value = "남자"> 남자
			<input type="radio" name="nom" value= "여자"> 여자
		</td>
	</tr>
	
	<tr> 
		<td>
			<input type="checkbox" name ="season" value = "봄"> 봄
			<input type="checkbox" name ="season" value = "여름"> 여름
			<input type="checkbox" name ="season" value = "가을">가을
			<input type="checkbox" name ="season" value = "겨울">겨울
		</td>
	</tr>
	
	<tr> 
		<td>
			<input type ="submit" name = "yes" value="확인"> 
			<input type ="submit" name = "no" value="취소">
		</td>
	</tr>
	</table>	
	</form>
	</body>
</html>