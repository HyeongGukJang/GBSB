<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>디테일 페이지</h1>
<table width="550" border="1">
	<tr>
		<th>번호</th>
		<td><c:out value="${board.seq }"/></td>
	</tr>
	<tr>
		<th>제목</th>
		<td><c:out value="${board.title }"/></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><c:out value="${board.writer }"/></td>
	</tr>
	<tr>
		<th>받은시간</th>
		<td><c:out value="${board.regDate }"/></td>
	</tr>
	<tr>
		<th>보낸이ID</th>
		<td><c:out value="${board.sendid }"/></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><c:out value="${board.content }"/></td>
	</tr>
</table>
	<a href="list">목록</a>
	<a href="delete?seq=${board.seq }">삭제</a>
</body>
</html>