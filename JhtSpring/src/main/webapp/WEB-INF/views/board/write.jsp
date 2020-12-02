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
<h1>게시판 글쓰기 화면</h1>
<%-- ${name}
<form action="/board/write" method="post" enctype="multiPart/form-data">
<input type="file" name="files" multiple>
<input type="submit"> --%>
<!-- </form> -->
<form action="/board/write" method="post">
	<table border="1">
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" cols="20" name = "content"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="글쓰기"></td>
		</tr>
	</table>

</form>


</body>
</html>