<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>삭제 페이지</h1>
	<form action="delete" method="POST">
	<input type="hidden" name="seq" value="${board.seq }" />
		<h3>
			<c:out value="${board.content }의 쪽지를 정말로 삭제하시겠습니까?" />
		</h3>
		<input type="submit" value="삭제하기" />
	</form>
</body>
</html>