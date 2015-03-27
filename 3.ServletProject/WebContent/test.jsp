<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<title>JSP/Servlet</title>
		<style>
			body{
				background-image:url("1212.jpg");
				background-repeat:no-repeat;
				background-attachment:fixed;
				background-position:center;
				
			}
			
			input,select, textarea{
				border:black 1.5pt solid;
				background : red;
				color: pink;
				font-size:30px;
			}
			<!-- www.w3schools.com 의 CSS reference에 들어가면 있음.-->
		</style>
		
		<script>
			function testfunc(){
				alert("Hello JavaScript")
			}
			
			<!-- www.w3schools.com 의  javascript reference에 들어가면 있음.-->
		</script>
</head>
	<body>
	<!-- test.jsp -->
	<h1>Servlet Test</h1>
	<hr>	
	
	<form action="TestServlet" onsubmit="return testfunc()">
		<input type="text" name="id"><br>
		 
		<input type="radio" name="gender" value="남자"> 남자
		<input type="radio" name="gender" value="여자"> 여자 <br>
		
		<input type="checkBox" name="hobby" value="축구">축구
		<input type="checkBox" name="hobby" value="야구">야구
		<input type="checkBox" name="hobby" value="농구">농구
		
		<select name="subject">
			<option value="html">HTML</option>
			<option value="css">CSS</option>
			<option value="javaScript">JavaScript</option>
		</select><br>
		
		<textarea name="txt" rows="100" cols="3"></textarea><br>
		
		<input type="color" name="myColor"><br>
		<input type="email" name="myEmail"><br>
		
		<input type="submit" value="서버로 제출">
	</form>	
	</body>
</html>