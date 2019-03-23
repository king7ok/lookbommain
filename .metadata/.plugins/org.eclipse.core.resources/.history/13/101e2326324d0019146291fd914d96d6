<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="user.model.vo.LookBomUser"%>
<%
	LookBomUser loginUser = (LookBomUser) session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>semi</title>
<script type="text/javascript">
	function showMembership() {
		location.href = "/semi/views/user/membership.jsp"
	}
	function findId() {
		location.href = "/semi/views/user/findId.jsp"
	}
	function findPwd() {
		location.href = "/semi/views/user/findPwd.jsp"
	}
</script>
</head>
<body>
	<div align="center">
		<h2>LOGIN</h2>

		<div>
			<form action="/semi/login" method="post">
				<input type="text" name="userid" placeholder="ID"
					style="border-color: black;" required><br> <input
					type="password" name="userpwd" placeholder="PASSWORD"
					style="border-color: black;" required><br> <input
					type="submit" value="LOGIN"
					style="border: 0; width: 160px; color: white; background-color: gray;"
					required>
				<hr>
				<input type="button" name="membership" value="회원가입"
					onclick="showMembership();"> <input type="button"
					name="findid" value="아이디 찾기" onclick="findId();"> <input
					type="button" name="findpwd" value="비밀번호찾기" onclick="findPwd();">
			</form>
		</div>
</body>
</html>