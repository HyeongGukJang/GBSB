<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쪽지 작성 페이지</h1>
	<hr>
	<form action="write" method="POST">
		<table width="550" border="1">
			<tr>
				<th>(임시용)보낸이ID</th>
				<td><input type="text" name="sendid" value="보낸ID"/></td>
			</tr>
			<tr>
				<th>(임시용)보낸이(이름)</th>
				<td><input type="text" name="writer" value="보낸이"/></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="글쓰기연습"/></td>
			</tr>
			<tr>
				<th>받는이</th>
				<td><input type="text" name="receiveid" value="받는이"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" cols="50" rows="10">내용입니다.</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="전송하기" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>