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
<h1>게시판 리스트 화면입니다.</h1>
<table border="1">
	<tr>
		<td>번호</td><td>제목</td><td>작성자</td><td>작성일자</td>
	</tr>
	<!-- for 시작 -->
	<c:forEach items="${list}" var="board">
	<tr>
		<td><a href="/board/detail?bno=${board.bno}">${board.bno}</a></td>
		<td>${board.title }</td>
		<td>${board.writer }</td>
		<td>${board.regdate }</td>
	</tr>
	</c:forEach>
	<!-- for 끝 -->
</table>
</body>
</html>
