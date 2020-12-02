<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 수정 폼입니다.</h1>
<form action="/member/modify" method="post">
	<table border="1">
		<tr>
			<td>아이디(변경불가)</td>
			<td>${update.id }<input type="hidden" name="id" value="${update.id }"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="pw" value="${update.pw }"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${update.name }"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email" value="${update.email }"></td>
		</tr>
		<tr><td colspan="2"><input type="submit" value="수정하기"></td></tr>
	</table>
</form>
</body>
</html>