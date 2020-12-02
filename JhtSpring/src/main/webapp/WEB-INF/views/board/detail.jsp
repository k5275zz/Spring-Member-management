<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 페이지</h1>
	<form action="/board/update?bno=${detail.bno }" method="post">
		<table border="1">
			<tr>
				<td>게시글번호</td>
				<td>제목</td>
				<td>내용</td>
				<td>작성자</td>
				<td>작성날짜</td>
			</tr>

			<tr>
				<td>${detail.bno }</td>
				<td><input type="text" value="${detail.title }" name="title"></td>
				<td><input type="text" value="${detail.content }" name="content"></td>
				<td>${detail.writer}</td>
				<td>${detail.regdate }</td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="수정"></td>
				<td><a href="/board/delete?bno=${detail.bno }">삭제</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
