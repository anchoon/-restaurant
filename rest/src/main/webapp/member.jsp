<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form action="RegisterServlet" method="post">

		이름: <input type="text" name="name" required><br> 이메일: <input
			type="email" name="email" required><br> 비밀번호: <input
			type="password" name="password" required><br> <input
			type="submit" value="회원 가입">
	</form>
</body>
</html>
