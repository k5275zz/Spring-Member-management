<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function btn_click(str) {
		
		if(str=="update"){
			frm1.action = "/member/update";
			frm1.method = "get";
		}else{
			frm1.action = "/member/delete";
			frm1.method = "post";
		}
	}
</script>
</head>
<body>
	<form name="frm1">

		<table border="1">
			<tr>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>이메일</td>
			</tr>
			<tr>
				<td>${detail.id }<input type="hidden" value="${detail.id }" name="id"></td>
				<td>${detail.pw }</td>
				<td>${detail.email }</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정" onclick="btn_click('update')"></td>
				<td><input type="submit" value="계정탈퇴" onclick="btn_click('delete')"></td>
			</tr>
		</table>
	</form>
</body>

</html>