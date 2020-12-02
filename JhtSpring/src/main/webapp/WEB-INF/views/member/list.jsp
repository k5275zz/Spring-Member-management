<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원목록</h1>

<table border="1">
	<tr>
		<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td>
	</tr>
	<c:forEach items="${list }" var="member">
	<tr>
		<td><a href="/member/detail?id=${member.id }">${member.id }</a></td>
		<td>${member.pw }</td>
		<td>${member.name }</td>
		<td>${member.email }</td>
		<td>${member.joindate }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>