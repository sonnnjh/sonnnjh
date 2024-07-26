<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>여행지 등록</title>
</head>
<body>
	<h1>여행지 등록하기</h1>
	<form action="inputSave" method="post">
		여행 도시<input type="text" name="contry">
		여행 기간<input type="text" name="days">
		여행지 특징<input type="text" name="charact">
		<input type="submit" value="등록"> 
	</form>
</body>
</html>